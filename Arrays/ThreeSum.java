import java.util.Arrays;

public class ThreeSum {
    static int[] threeSum(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n-2 ; i++){
            for(int j = 0; j < n-1; j++){
                for(int k = 0; k < n ; k ++){
                    if(arr[i]  + arr[j] + arr[k] == 0){
                        return new int[]{arr[i], arr[j], arr[k]}; // return the elements if sum of triplet found
                    }
                }
            }
        }
        return new int[0]; // Returns an emprty  array if sum not found 
    }

    public static void main(String[] args) {
        int[] arr = {0,0,0}; // Test Case
        int[] result = threeSum(arr);
        System.out.println(Arrays.toString(result));
    }
}