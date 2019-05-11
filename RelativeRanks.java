public class Solution {
        public static final String[] M={"Gold Medal","Silver Medal","Bronze Medal"};
    
    public String[] findRelativeRanks(int[] nums) {
        String[] answer = new String[nums.length];
        int[] copy = Arrays.copyOf( nums, nums.length );
        Arrays.sort( copy );
        for(int i=0,p=0;i<nums.length;i++) answer[i]=M.length>(p=nums.length-1-Arrays.binarySearch(copy,nums[i]))?M[p]:""+(1+p);
        return answer;
    }
}