import java.util.HashMap;
class Solution {
    public boolean isIsomorphic(String s, String t) {
        char[] finalS = new char[s.length()];
        char[] finalT = new char[t.length()];
        char currentSLetter = 'a';
        char currentTLetter = 'a';
        HashMap<Character, Character> sHash = new HashMap<>();
        HashMap<Character, Character> tHash = new HashMap<>();
        for(int x = 0; x < s.length(); x++){
            try{
                finalS[x] = sHash.get(s.charAt(x));
            } catch(NullPointerException e){
                sHash.put(s.charAt(x), currentSLetter);
                finalS[x] = currentSLetter;
                currentSLetter++;
            }
            try{
                finalT[x] = tHash.get(t.charAt(x));
            } catch(NullPointerException f){
                tHash.put(t.charAt(x), currentTLetter);
                finalT[x] = currentTLetter;
                currentTLetter++;
            }
        }
        if(Arrays.equals(finalS, finalT)){
            return true;
        } else{
            return false;
        }
    }
}