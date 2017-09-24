public class Solution {
    int maxSubArray(int[] nums) {
        // Base Cases:
        // If there are no elements in the array the largest subarray is 0
        if (nums.length == 0) {
            return 0;
        }

        // An array that only has one element has a maximum subarray of that element
        if (nums.length == 1) {
            return nums[0];
        }

        return 0;
    }
}
