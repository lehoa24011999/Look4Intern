class Solution {
    private boolean isIn(int key, int[] num){  //judge if it's in, and del it
        for(int i = 0; i < num.length; i++){
            if(num[i] == key){
                num[i] = Integer.MAX_VALUE;
                return true;
            }
        }
        return false;
    }
    public int[] intersect(int[] nums1, int[] nums2) {  //try to find if every element in arr1 is in arr2
        int N = nums1.length > nums2.length?nums1.length:nums2.length;
        int[] ans = new int[N];
        int k = 0;
        for(int x : nums1){
            if(isIn(x,nums2)){
                ans[k++] = x;
            }
        }
        return  Arrays.copyOfRange(ans,0,k);
    }
}