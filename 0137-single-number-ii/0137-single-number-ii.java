class Solution {
    public int singleNumber(int[] nums) {
        int[] bits = new int[32];


        for (int num : nums) {
            for (int i = 0; i < 32; i++) {
                if (((num >> i) & 1) == 1) {
                    bits[i]++;
                }
            }
        }

        int ans = 0;

       
        for (int i = 0; i < 32; i++) {
            if (bits[i] % 3 != 0) {
                ans |= (1 << i);
            }
        }

        return ans;
    }
}