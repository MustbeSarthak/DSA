// LEETCODE 14 


class Longestprefix{

    public static void main(String[] args) {
        StringBuilder res = new StringBuilder();

        String[] arr = {"flower", "flow", "char"};
        String base = arr[0];
        for(int i = 0; i < arr.length ; i++){
            char ch = base.charAt(i);
            for(int j = 0; j < arr.length; j++){
                if(i > arr[j].length() || arr[j].charAt(i) != ch){
                    System.out.println(res.toString());
                    return;
                }

            }
            res.append(ch);
        }
        System.out.println(res.toString());
    }
    // static int findPrefix(int[] arr){
    //     int count = 0;
    //     for(int i = 0; i < arr.length ; i++){
    //         for(int j = i + 1; arr.length ; j++){
    //            if(arr[i].charAt(0) == arr[j].charAt(0)){
    //             count++;
    //            }
    //     }
    //     }
    //     return 0;
    // }
    
}