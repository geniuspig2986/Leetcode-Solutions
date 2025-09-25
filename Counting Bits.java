//Solved September 22 2025
//First solution was not solved in linear time. This one is. Not bit manipulation however
class Solution {
    public int[] countBits(int n) {
        int[] outputArray = new int[n+1];
        int pow = 1;
        int x = 1;
        for(int i = 1; i <= n; i++){
            if(i == pow){
                pow *= 2;
                x = i;
            }
            outputArray[i] = outputArray[i - x] + 1;
        }
        return outputArray;
    }
}