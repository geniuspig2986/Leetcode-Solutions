//Solved September 22 2025
//Bitwise manipulation and manual binary to decimal
class Solution {
    public int reverseBits(int n) {
        boolean[] binary = new boolean[32];
        for(int x = 31; x >= 0; x--){
            binary[31-x] = ((n & (1 << x)) != 0);
        }
        int result = 0;
        int pow = 1;
        for(boolean x:binary){
            if(x){
                result += pow;
            }
            pow *= 2;
        }
        return result;
    }
}