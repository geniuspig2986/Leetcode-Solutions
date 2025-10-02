//Solved October 2nd 2025
class Solution {
    public int maxArea(int[] height) {
        int x = 0;
        int y = height.length-1;
        int maxVol = 0;
        while(x < y){
            int h = Math.min(height[x], height[y]);
            int w = y - x;
            maxVol = Math.max(maxVol, h * w);
            if(height[x] < height[y]){
                x++;
            }else{
                y--;
            }
            
        }
        return(maxVol);

    }
}