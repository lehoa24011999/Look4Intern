class Solution {
    public boolean hasAlternatingBits(int n) {
        while (n > 0) {
            int cur = n % 2;
            n /= 2;
            if (cur == n % 2) return false;

        }
        return true;
    }
}