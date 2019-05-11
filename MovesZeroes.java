class Solution {
    public void moveZeroes(int[] nums) {
        int writeIdx=0;
        for(int i=0; i<nums.length;++i){
            if(nums[i]!=0){
                nums[writeIdx++]=nums[i];
            }
        }
        for(int i=writeIdx; i<nums.length;++i){
            nums[i]=0;
        }
    }
}