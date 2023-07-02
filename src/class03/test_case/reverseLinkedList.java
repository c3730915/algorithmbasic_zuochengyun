package class03.test_case;

import class03.Code01_ReverseList;

public class reverseLinkedList {
    /**
     * 递归的方式反转列表
     * https://leetcode.com/problems/reverse-linked-list/
     * @param head
     * @return
     */
    public Code01_ReverseList.Node reverseList(Code01_ReverseList.Node head) {
        if(head == null || head.next == null){
            return head;
        }
        Code01_ReverseList.Node  curr =  reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return curr;
    }
}
