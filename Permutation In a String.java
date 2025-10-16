import java.util.Arrays;
class Solution {
    public boolean checkInclusion(String s2, String s1) {
        int[] s2FreqMap = new int[26];
        for(int x = 0; x < s2.length(); x++){
            s2FreqMap[s2.charAt(x)-'a']++;
        }
        int[] curFreqMap = new int[26];
        for(int x = 0; x < s1.length(); x++){
            curFreqMap[s1.charAt(x)-'a']++;
            if((x - s2.length()) >= 0){
                curFreqMap[s1.charAt(x - s2.length())-'a']--;
            }
            if(Arrays.equals(curFreqMap, s2FreqMap)){
                return true;
            };
        }
        return false;
    }
}