package class03;

/**
 * 用数组实现队列（环形数组方式）
 * 思路：维护一个size变量，记录数组中有多少元素
 * 在加入的时候，永远放到末尾。弹出的时候 永远弹出头部
 * 在分别进行加入，弹出操作的时候，对尾指针，头指针进行更新 寻找下一个位置（环形操作，如果超出下标那么就归零）
 */
public class Code04_RingArray {

	public static class MyQueue {
		private int[] arr;
		private int pushi;// end
		private int polli;// begin
		private int size;
		private final int limit;

		public MyQueue(int limit) {
			arr = new int[limit];
			pushi = 0;
			polli = 0;
			size = 0;
			this.limit = limit;
		}

		public void push(int value) {
			if (size == limit) {
				throw new RuntimeException("队列满了，不能再加了");
			}
			size++;
			arr[pushi] = value;
			pushi = nextIndex(pushi);
		}

		public int pop() {
			if (size == 0) {
				throw new RuntimeException("队列空了，不能再拿了");
			}
			size--;
			int ans = arr[polli];
			polli = nextIndex(polli);
			return ans;
		}

		public boolean isEmpty() {
			return size == 0;
		}

		// 如果现在的下标是i，返回下一个位置
		private int nextIndex(int i) {
			return i < limit - 1 ? i + 1 : 0;
		}

	}

}
