//solved september 29 2025
//try catch seems inefficient. need to check optimal solution
import java.util.HashMap;
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int bound = 0;
        if(magazine.length() < ransomNote.length()){
            bound = ransomNote.length();
        } else{
            bound = magazine.length();
        }
        HashMap<Character,Integer> ransomMap = new HashMap<>();
        HashMap<Character,Integer> magazineMap = new HashMap<>();
        for(int x = 0; x < bound; x++){
            try{
                char y = ransomNote.charAt(x);
                try{
                    ransomMap.put(y, ransomMap.get(y)+1);
                } catch(NullPointerException e){
                    ransomMap.put(y, 0);
                }
            } catch(StringIndexOutOfBoundsException d){}
            try{
            char y = magazine.charAt(x);
                try{
                    magazineMap.put(y, magazineMap.get(y)+1);
                } catch(NullPointerException e){
                    magazineMap.put(y, 0);
                }
            } catch(StringIndexOutOfBoundsException d){}
        }
        for(char x: ransomMap.keySet()){
            try{
                if(ransomMap.get(x) > magazineMap.get(x)){
                    return false;
                }
            }catch(NullPointerException e){
                return false;
            }
        }
        return true;
    }
}