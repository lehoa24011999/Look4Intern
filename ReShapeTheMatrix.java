class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int rows = nums.length;
        int cols = nums[0].length;
        if(rows*cols != r*c){
            return nums;
        }
        int index = 0;
        int[][] result = new int[r][c];
        for(int i=0; i < rows; i++){
            for(int j =0; j < cols; j++){
                result[index/c][index%c] = nums[i][j];
                index++;
            }
        }
        return result;
    }
}
