class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashMap<Integer, Integer> num = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i : nums) {
            if (!num.containsKey(i)) num.put(i, 1);
        }
        for (int i = 1; i <= nums.length; i++) {
            if (num.containsKey(i)) continue;
            ans.add(i);
        }
        return ans;
    }
}