class Solution {
    public boolean isHappy(int n) {
        while (n > 9) {
            n = converNum(n);
        }
        return n == 1 || n == 7;
    }
    static private int converNum(int n) {
        int res = 0;
        while (n / 10 != 0) {
            res += (n % 10) * (n % 10);
            n = n / 10;
        }
        res += (n % 10) * (n % 10);
        return res;
    }
}