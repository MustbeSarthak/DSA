class Solution {
    public int countCommas(int n) {
        long ans = 0;
        long start = 1000;
        long commas = 1;

        while (start <= n) {
            ans += (n - start + 1) * commas;
            start *= 1000;
            commas++;
        }

        return (int) ans;
    }
}