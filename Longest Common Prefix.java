//Solved September 12 2025
//horribly inefficient
class Solution {
    public String longestCommonPrefix(String[] strs) {
        String finalString = "";
        int shortestString = strs[0].length();
        for(int z = 0; z < strs.length; z++){
            if(strs[z].length() < shortestString){
                shortestString = strs[z].length();
            }
        }
        for(int x = 0; x < shortestString; x++){
            char currentCharacter = strs[0].charAt(x);
            for(int y = 0; y < strs.length; y++){
                if(strs[y].charAt(x) != currentCharacter){
                    return(finalString);
                }
                if(strs[y].charAt(x) == currentCharacter && y == (strs.length-1)){
                    finalString = finalString + currentCharacter;
                }
            }
        }
    return(finalString);
    }
}