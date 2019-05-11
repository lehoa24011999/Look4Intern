class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        return convert(A);
    }
    public int[][] convert(int[][] a){
        a = flip(a);
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[0].length; j++){
                a[i][j]=a[i][j]^1;
            }
        }
        return a;
    }
    public int[][] flip(int[][] a){
        for(int i=0; i<a.length; i++){
            int n=a[0].length;
            for(int j=0; j<n/2; j++){
                int temp=a[i][j];
                a[i][j]=a[i][n-j-1];
                a[i][n-j-1]=temp;
            }
        }
        return a;
    }
}
// Good solution: 
Reference from:
https://leetcode.com/awice/
 

class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        int C = A[0].length;
        for (int[] row: A)
            for (int i = 0; i < (C + 1) / 2; ++i) {
                int tmp = row[i] ^ 1;
                row[i] = row[C - 1 - i] ^ 1;
                row[C - 1 - i] = tmp;
            }

        return A;
    }
}