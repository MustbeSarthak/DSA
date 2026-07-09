class Solution {
     public static String longestCommonPrefix(String[] arr) {
        String base = arr[0];
        StringBuilder res = new StringBuilder();

        for(int i = 0; i < base.length(); i++){
            char ch = base.charAt(i);

            for(int j = 1; j < arr.length; j++){
                if(i >= arr[j].length() || arr[j].charAt(i) != ch){
                    return res.toString();
                }
            }

            res.append(ch);
        }

        return res.toString();
    }
}