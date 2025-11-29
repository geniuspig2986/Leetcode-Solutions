class Solution {
    public void rotate(int[][] matrix) {
        int temp = 0;
        for(int x = 0; x < matrix.length; x++){
            for(int y = x; y < matrix[0].length; y++){
                temp = matrix[x][y];
                matrix[x][y] = matrix[y][x];
                matrix[y][x] = temp;
            }
        }
        int left = 0;
        int right = 0;
        for(int x = 0; x < matrix.length; x++){
            left = 0;
            right = matrix[x].length-1;
            while (left < right) {
            temp = matrix[x][left];
            matrix[x][left] = matrix[x][right];
            matrix[x][right] = temp;
            left++;
            right--;
            }
        }

    }
}