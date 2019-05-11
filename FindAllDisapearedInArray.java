class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> re=new ArrayList<>();
        int[] count=new int[nums.length+1];
        for(int n:nums)
            count[n]++;
        for(int i=1;i<=nums.length;i++)
            if(count[i]==0)
                re.add(i);
        return re;
        
    }
}