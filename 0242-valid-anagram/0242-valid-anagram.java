import java.util.HashMap;

class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> hashS  = new HashMap<>();
        HashMap<Character, Integer> hashT  = new HashMap<>();

        for(char c : s.toCharArray()){
            hashS.put(c, hashS.getOrDefault(c, 0) + 1);
        }

        for(char c : t.toCharArray()){
            hashT.put(c, hashT.getOrDefault(c, 0) + 1);
        }

        if(hashS.equals(hashT)){
            return true;
        }
        return false;
    }
}