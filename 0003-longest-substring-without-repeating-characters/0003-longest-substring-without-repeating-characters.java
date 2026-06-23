import java.util.HashSet;

class Solution {

    public int lengthOfLongestSubstring(String str) {

        HashSet<Character> set = new HashSet<>();

        int left = 0;
        int maxLen = 0;

        for (int right = 0; right < str.length(); right++) {

            char current = str.charAt(right);

            while (set.contains(current)) {
                set.remove(str.charAt(left));
                left++;
            }

            set.add(current);

            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}