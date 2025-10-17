class Solution {
    public int characterReplacement(String s, int k) {
        int start = 0;
        int maxLength = 0;
        int maxFreq = 0;
        int[] letterFreq = new int[26];
        for(int x = 0; x < s.length(); x++){
            maxFreq = Math.max(maxFreq, ++letterFreq[s.charAt(x) - 'A']);
            while(x - start + 1 - maxFreq > k){
                letterFreq[s.charAt(start)-'A']--;
                start++;
            }
            maxLength = Math.max(maxLength, x - start + 1);
        }
        return maxLength;
    }
}