import java.util.Scanner;
public class TwoSum {
    static int[] TwoSu(int target, int[] arr ){
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] + arr[j] == target){
                    return new int[]{i , j};
                }
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int target;
        int[] arr = {2,7,11,15};  
        System.out.print("Enter Your Target: "); 
        target = in.nextInt();
        int[] result = TwoSu(target, arr);
        System.out.println(result[0] + " , " + result[1]);
    }
}   
