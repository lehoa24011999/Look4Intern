class Solution {
    public String reverseStr(String s, int k) {   
        char []c=s.toCharArray();
        int index=0;
        while(index<c.length){
           if(index+k-1<c.length){
              reverse(c,index,index+k-1);    
           }else{
              reverse(c,index,c.length-1);
           }    
        index+=2*k;
        }      
        return new String(c);
    }
    public void reverse(char[] c, int start, int end){
        while(start<end){
            char temp=c[start];
            c[start]=c[end];
            c[end]=temp;
            start++;
            end--;
        }
    }
}