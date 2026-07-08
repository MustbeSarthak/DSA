class Solution {
    public List<Integer> findDuplicates(int[] arr) {
        List<Integer> ans = new ArrayList<>();
        int i = 0;
        while (i < arr.length) {
            int index = arr[i] - 1;
            if (arr[i] != arr[index]) {
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
            } else {
                i++;
            }
        }
        for(int index = 0; index < arr.length; index++){
            if(arr[index] != index+1){
                ans.add(arr[index]);
            }
        }
        return ans;
    }
}