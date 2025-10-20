//This is so convoluted but it works
import java.util.List;
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int xIndex = 0;
        int yIndex = 0;
        int cycle = 0;
        int totalIndices = 0;
        List<Integer> finalArray = new ArrayList<>();
        while(true){
            for(;xIndex < matrix[0].length - cycle; xIndex++){
                totalIndices++;
                finalArray.add(matrix[yIndex][xIndex]);
                if(matrix[0].length*matrix.length <= totalIndices){
                    return finalArray;
                }
            }
            xIndex--;
            yIndex++;
            for(;yIndex < matrix.length - cycle; yIndex++){
                totalIndices++;
                finalArray.add(matrix[yIndex][xIndex]);
                if(matrix[0].length*matrix.length <= totalIndices){
                    return finalArray;
                }
            }
            yIndex--;
            xIndex--;
            for(;xIndex > cycle; xIndex--){
                totalIndices++;
                finalArray.add(matrix[yIndex][xIndex]);
                if(matrix[0].length*matrix.length <= totalIndices){
                    return finalArray;
                }
            }
            cycle++;
            for(;yIndex > cycle; yIndex--){
                totalIndices++;
                finalArray.add(matrix[yIndex][xIndex]);
                if(matrix[0].length*matrix.length <= totalIndices){
                    return finalArray;
                }
            }
        }
        
    }
}