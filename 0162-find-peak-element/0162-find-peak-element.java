class Solution {
    public int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length-2;
        while(left<=right){
            int mid = left + (right - left)/2;

            // peak exists in right side
            if(nums[mid]<nums[mid+1]) left = mid + 1;
            
            // Definately the peak exists in left side
            else right = mid - 1;
        }
        return left;
    }
}