class Solution {
    public int findContentChildren(int[] g, int[] s)
        {
            Arrays.sort(g);
            Arrays.sort(s);

            int j=g.length-1,count=0,i=s.length-1;
            while(i>=0 && j>=0)
            {
                if(s[i]>=g[j])
                {
                    i--;
                    j--;
                    count++;
                }
                else
                {
                    j--;
                }
            }
            return count;
        }
}