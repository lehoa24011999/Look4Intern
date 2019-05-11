class Solution {
    public String licenseKeyFormatting(String s, int k) {
        StringBuilder res = new StringBuilder();
        for (int i=s.length()-1, rem = k+1;i>=0;i--) {
            if (s.charAt(i) == '-') continue;
        if (--rem == 0) {
            res.append("-"); 
            rem = k;
        }
        res.append(Character.toUpperCase(s.charAt(i)));
       }
       return res.reverse().toString();
    }
}