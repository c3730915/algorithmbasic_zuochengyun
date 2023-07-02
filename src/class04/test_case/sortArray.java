package class04.test_case;

import java.util.Arrays;
import java.util.List;

public class sortArray {
    //https://leetcode.com/problems/sort-an-array/submissions/983729138/
    public static int[] sortArray(int[] nums) {
        if (nums == null || nums.length < 2){
            return nums;
        }
        process(0,nums.length-1, nums);
        return nums;
    }

    public static void merge(int left, int right, int mid, int[] nums) {
        int help_left = left;
        int help_right = mid + 1;
        int help_ptr = 0;
        int[] help_array = new int[right - left + 1];

        while ( help_left <= mid && help_right <= right ) {
            help_array[help_ptr++] = nums[help_left] <= nums[help_right] ? nums[help_left++] : nums[help_right++];
        }

        //如果有数组出边界了
        while ( help_left <= mid ) {
            //左边还没出边界
            help_array[help_ptr] = nums[help_left];
            help_left++;
            help_ptr++;

        }
        while ( help_right <= right ) {
            help_array[help_ptr] = nums[help_right];
            help_ptr++;
            help_right++;
        }

        // copy array
        for ( int i = 0; i < help_array.length; i++ ) {
            nums[left+i] = help_array[i];
        }
    }
    public static void process(int left, int right, int[] nums){
        if ( left == right ){
            return;
        }
        int mid = left +((right - left )>>1);

        //左半部分先有序
        process( left,mid,nums );
        //右半部分先有序
        process( mid+1,right,nums );
        //merge array
        merge( left,right,mid,nums );

    }

    public static void main(String[] args) {
        int[] array = new int[]{5,1,1,2,0,0};
        sortArray(array);
        System.out.println( Arrays.toString( array ) );
    }

}
