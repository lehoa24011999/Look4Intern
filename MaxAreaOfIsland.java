class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int m = grid.length, n = grid[0].length, maxarea = 0;
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                maxarea = Math.max(maxarea, dfs(i, j, grid));
        return maxarea;
    }

    private int dfs(int i, int j, int[][] grid) {
        return (i < 0 || grid.length <= i || j < 0 || grid[0].length <= j || grid[i][j] <= 0) ? 0
            : grid[i][j]-- + dfs(i, j+1, grid) + dfs(i+1, j, grid) + dfs(i, j-1, grid) + dfs(i-1, j, grid);
    }
}