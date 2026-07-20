class Solution {
    public int maxAbsoluteSum(int[] nums) {
      
        int currentMax = nums[0];
        int max = nums[0];

        int currentMin = nums[0];
        int min = nums[0];
        for(int i = 1; i < nums.length; i++){
            currentMax = Math.max(nums[i], currentMax + nums[i]);
            max = Math.max(max, currentMax);

            currentMin = Math.min(nums[i], currentMin + nums[i]);
            min = Math.min(min, currentMin);
        }
        return Math.max(max, Math.abs(min));
    }
}