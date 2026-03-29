import java.util.Arrays;

public class Leetcode5 {
    public static void main(String[] args) {
        int[] arr = {1,2};
        int[] arr2 = {3}; 
        System.out.println(merge(arr, arr2)); 
    }

    private static double merge(int[] left, int[] right) {
        int mix[] = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if(left[i] < right[j]){
                mix[k] = left[i];
                i++;
            }else{
                mix[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < left.length) {
            mix[k] = left[i];
            i++;
            k++;
        }

        while (j < right.length) {
            mix[k] = right[j];
            j++;
            k++;
        }

        return median(mix);
    }

    static double median(int[] arr){
        int n = arr.length;
        int mid = n / 2;

        if(n % 2 == 0){
            return (arr[mid] + arr[mid - 1]) / 2.0;
        }else{
            return arr[mid];
        } 
    }
}