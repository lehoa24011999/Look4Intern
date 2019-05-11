class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        if(matrix == null || matrix.length == 0) return true;
        for(int i = 0; i < matrix.length; i++){
            if(!check(matrix[i][0], i, 0, matrix)){
                return false;
            }
        }
        for(int i = 0 ; i < matrix[0].length; i++){
            if(!check(matrix[0][i],0, i, matrix)){
                return false;
            }
        }
        return true;
    }
    private boolean check(int val, int i, int j, int[][] matrix){
        if(i >= matrix.length || j >= matrix[0].length) return true;
        if(val != matrix[i][j]) {
            return false;
        }
        return check(val, i + 1, j + 1, matrix);
    }
}
