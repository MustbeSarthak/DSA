class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        int[] ans = new int[nums.length];

        for(int i = 0; i < nums.length; i++){
            if(i == 0){
                left[i] = 1;
            }else{
                left[i] = nums[i-1] * left[i - 1];
            }
        }

        for(int j = nums.length - 1; j >= 0 ; j--){
             if(j == nums.length-1){
                right[j] = 1;
            }else{
                right[j] = nums[j+1]*right[j+1];
            }
        }
        
        for(int k = 0; k < nums.length; k++){
            ans[k] = left[k] * right[k];
        }

        return ans;

    }
}