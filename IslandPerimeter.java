public class Solution {
    public int islandPerimeter(int[][] grid) {
        int sum=0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    sum+=4;
                    sum=(i < grid.length - 1 && grid[i + 1][j] == 1) ?sum-2:sum; // count down neighbours
                    sum=(j < grid[i].length - 1 && grid[i][j + 1] == 1)?sum-2:sum; // count right neighbours
                }
            }
        }

        return sum;
    }
}