class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length; // 3
        int n = matrix[0].length;  // 4

        int low = 0;
        int high = m*n-1; // 11

        while(low<=high){
            int mid = low + (high - low) / 2; 

            int row = mid /n; 
            int col = mid % n; 

            if(matrix[row][col] == target){
                return true;
            }

            if(matrix[row][col]<target){
                low = mid + 1;
            }else{
                high=mid-1;
            }
        }
        return false;
    }
}