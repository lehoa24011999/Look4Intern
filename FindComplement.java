class Solution {
    public int findComplement(int num) {
        int temp = 1;
        int n = num;
        while (n > 0) {
            temp <<= 1;
            n /= 2;
        }
        
        return num ^ (temp - 1);
    }
}
Reference from:
https://leetcode.com/ocadaruma/
