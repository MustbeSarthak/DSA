class Solution {
    public int firstStableIndex(int[] nums, int k) {
        if (nums.length == 0) return 0;

        int n = nums.length;
        int instability;

        // Prefix maximum
        int[] leftMax = new int[n];
        int currMax = nums[0];

        for (int i = 0; i < n; i++) {
            currMax = Math.max(currMax, nums[i]);
            leftMax[i] = currMax;
        }

        // Suffix minimum
        int[] rightMin = new int[n];
        int currMin = nums[n - 1];

        for (int i = n - 1; i >= 0; i--) {
            currMin = Math.min(currMin, nums[i]);
            rightMin[i] = currMin;
        }

        // Check instability
        for (int i = 0; i < n; i++) {
            instability = leftMax[i] - rightMin[i];

            if (instability <= k) {
                return i;
            }
        }
        return -1;
    }
}