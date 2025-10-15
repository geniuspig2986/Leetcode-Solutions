import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> startIndices = new ArrayList<Integer>();
        int[] pFreqMap = new int[26];
        for(int x = 0; x < p.length(); x++){
            pFreqMap[p.charAt(x)-'a']++;
        }
        int[] curFreqMap = new int[26];
        for(int x = 0; x < s.length(); x++){
            curFreqMap[s.charAt(x)-'a']++;
            if((x - p.length()) >= 0){
                curFreqMap[s.charAt(x - p.length())-'a']--;
            }
            if(Arrays.equals(curFreqMap, pFreqMap)){
                startIndices.add(x-p.length()+1);
            };
        }
        return startIndices;
    }
}