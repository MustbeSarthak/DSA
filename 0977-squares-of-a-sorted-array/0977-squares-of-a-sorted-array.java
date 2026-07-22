class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int left = 0, right = n - 1, index = n -1;
        int[] ans = new int[n];

        while(left <= right){
            if(Math.abs(nums[left]) > Math.abs(nums[right])){
                ans[index] = nums[left] * nums[left];
                left++;
            }else{
                ans[index] = nums[right] *  nums[right];
                right--;
            }
            index--;
        }
        return ans;
    }
}