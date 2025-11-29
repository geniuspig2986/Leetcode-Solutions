//Solved Sept 10 2025
//There is a more efficeint 2-pointer that skips over non-alphanumeric while running instead of at the start
class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.toLowerCase();
        int y = s.length()-1;
        for(int x = 0; x < (s.length()/2); x++){
            if(s.charAt(x) != s.charAt(y)){
                return(false);
            }
            y--;
        }
        return(true);
    }
}