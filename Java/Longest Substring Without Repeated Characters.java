import java.util.HashSet;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxSize = 0;
        int y = 0;
        LinkedHashSet<Character> substring = new LinkedHashSet<Character>();
        for(int x = 0; x < s.length(); x++){
            while(substring.contains(s.charAt(x))){
                substring.remove(s.charAt(y));
                y++;
            }
            substring.add(s.charAt(x));
            if(substring.size() > maxSize){
                maxSize = substring.size();
            }
        }
        return maxSize;
    }
}