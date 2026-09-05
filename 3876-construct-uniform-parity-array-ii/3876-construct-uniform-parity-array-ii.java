class Solution {
    public boolean uniformArray(int[] nums1) {
        int minOdd = Integer.MAX_VALUE;
        int minEven = Integer.MAX_VALUE;

        for (int num : nums1) {
            if (num % 2 == 0) {
                minEven = Math.min(minEven, num);
            } else {
                minOdd = Math.min(minOdd, num);
            }
        }

        // Case 1: Already all even
        if (minOdd == Integer.MAX_VALUE) {
            return true;
        }

        // Case 2: Try to make everything odd
        if (minEven == Integer.MAX_VALUE) {
            return true; // Already all odd
        }

        return minOdd < minEven;
    }
}