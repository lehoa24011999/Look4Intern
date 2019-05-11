class Solution {
    public int[][] transpose(int[][] A) {
        int r = A.length, c = A[0].length;
        int[][] temp = new int[c][r];
        for (int i = 0; i < c; ++i)
            for (int j = 0; j < r; ++j) {
                temp[i][j] = A[j][i];
            }
        return temp;
    }
}