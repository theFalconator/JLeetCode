public class Solution {
    public int removeDuplicates(int[] nums) {

        // special case for empty input
        if (nums.length == 0) {
            return 0;
        }

        int prev = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[prev]) {
                prev += 1;
                nums[prev] = nums[i];
            }
        }

        return prev + 1;
    }
}
