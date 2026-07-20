class Solution {
    public void sortColors(int[] nums) {
        // Red = 0, White = 1, Blue = 2
        int low = 0, mid = 0, temp = 0;
        int high = nums.length - 1;
        
        while(mid <= high){
            switch(nums[mid]){
                case 0:{
                    temp = nums[low];
                    nums[low] = nums[mid];
                    nums[mid] = temp;
                    low++;
                    mid++;
                    break;
                }

                case 1:{
                    mid++;
                    break;
                }

                case 2:{
                    temp = nums[mid];
                    nums[mid] = nums[high];
                    nums[high] = temp;
                    high--;
                    break;
                }
            }
        }
    }
}