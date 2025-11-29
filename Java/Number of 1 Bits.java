//Solved September 22 2025
class Solution {
    public int hammingWeight(int n) {
        int numBits = 0;
        //int defaults to 32 bits. No need to check further
        for(int i = 0; i < 32;i++){
            // << is the bitwise shift. left hand side is what is being shifted
            // right hand side is how many positions to shift.
            //(n & (1 << i)) shifts 1 to the ith position, then checks the bit at n. if it is 1 like the ith position, then return true
            if((n & (1 << i)) != 0){
                numBits++;
            }
        }
        return numBits;
    }
}