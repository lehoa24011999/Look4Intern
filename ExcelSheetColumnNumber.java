class Solution {
    public int titleToNumber(String s) {
            if(s.length()==1){
                return ((int)s.charAt(0))-64;
            }
            int sum = 0;
            for(int i=0; i<s.length(); i++){
                sum+=Math.pow(26, s.length()-1-i)*(((int)s.charAt(i))-64);
            }
            return sum;
        }
}