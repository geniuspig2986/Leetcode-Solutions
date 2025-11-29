import java.util.Stack;
class Solution {
    public String removeDuplicates(String s) {
        StringBuilder newStr = new StringBuilder();
        for(char c: s.toCharArray()){
            if(newStr.length() > 0 && newStr.charAt(newStr.length()-1) == c){
                newStr.deleteCharAt(newStr.length()-1);
            } else{
                newStr.append(c);
            }
        }
        return newStr.toString();
    }
}