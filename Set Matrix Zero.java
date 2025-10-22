import java.util.List;
class Solution {
    public void setZeroes(int[][] matrix) {
        List<Integer> rows = new ArrayList<>();
        List<Integer> columns = new ArrayList<>();
        int index = 0;
        for(int x = 0; x < matrix[0].length; x++){
            for(int y = 0; y < matrix.length; y++){
                if(matrix[y][x] == 0){
                    rows.add(y);
                    columns.add(x);
                }
            }
        }
        for(int x:rows){
            for(int y = 0; y < matrix[x].length; y++){
                matrix[x][y] = 0;
            }
        }
        for(int x:columns){
            for(int y = 0; y < matrix.length; y++){
                matrix[y][x] = 0;
            }
        }
    }
}