class Solution {
 public int[][] imageSmoother(int[][] M) {
        int[][] res = new int[M.length][M[0].length];
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[0].length; j++) {
                res[i][j] = getValue(M, i, j);
            }
        }
        return res;
    }
    private int getValue(int[][] M, int x, int y) {
        int count = 0;
        int sum = 0;
        for (int i = x - 1; i <= x + 1; i++) {
            for (int j = y - 1; j <= y + 1; j++) {
                if (i >= 0 && j >= 0 && i < M.length && j < M[0].length) {
                    count++;
                    sum += M[i][j];
                }
            }
        }
        return sum / count;
    }
}