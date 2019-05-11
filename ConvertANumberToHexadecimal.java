class Solution {
    public String toHex(int num) {
        String s = "";
        do {
            int cur = num & 15;
            if (cur >= 10) {
                s = (char) (cur - 10 + 'a') + s;
            } else {
                s = cur + s;
            }
            num >>>= 4;
        } while (num != 0);
        return s;
    }
}