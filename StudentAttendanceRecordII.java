class Solution {
    public boolean checkRecord(String s) {
        char[] att = s.toCharArray();
        int aCount = 0;
        int lCount = 0;
        for(char c : att){
            if(c=='A'){
                aCount++;
                lCount =0;
                if(aCount>1)
                    return false;
            }
            else if(c=='L'){
                lCount++;
                if(lCount>2)
                    return false;
            }
            else if(c=='P'){
                lCount =0;
            }
        }
        return true;
    }
}