class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {

            // Current search space already sorted
            if (nums[left] < nums[right]) {
                return nums[left];
            }

            int mid = left + (right - left) / 2;

            // Left half is sorted
            if (nums[left] <= nums[mid]) {
                left = mid + 1;
            } 
            // Right half is sorted
            else {
                right = mid;
            }
        }

        return nums[left];
    }
}