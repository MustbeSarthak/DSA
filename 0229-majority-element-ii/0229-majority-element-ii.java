import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }

        // Frequencies done now we have to check whose frequency is n/3
        List<Integer> ans = new ArrayList<>();

        for(int key : map.keySet()){
            if(map.get(key) > nums.length / 3){
                ans.add(key);
            }
        }
        return ans;
    }
}