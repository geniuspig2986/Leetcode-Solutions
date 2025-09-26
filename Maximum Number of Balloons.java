//solved September 25 2025
import java.util.HashMap;

class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap <Character, Integer> balloonLetters = new HashMap<>();
        balloonLetters.put('b', 0);
        balloonLetters.put('a', 0);
        balloonLetters.put('l', 0);
        balloonLetters.put('o', 0);
        balloonLetters.put('n', 0);
        for(int x = 0; x < text.length(); x++){
            char y = text.charAt(x);
            if(y == 'b' || y == 'a' || y == 'l' || y == 'o' || y == 'n'){
                balloonLetters.put(y, balloonLetters.get(y)+1);
            }
        }

        char[] oneLetters = {'b','a','n'};
        int leastOneLetters = 0;
        leastOneLetters = balloonLetters.get('b');
        for(int x = 1; x < 3; x++){
            if(balloonLetters.get(oneLetters[x]) < leastOneLetters){
                leastOneLetters = balloonLetters.get(oneLetters[x]);
            }
        }
        int leastTwoLetters = balloonLetters.get('l');
        if(balloonLetters.get('o') < leastTwoLetters){
            leastTwoLetters = balloonLetters.get('o');
        }
        if(leastTwoLetters/2 < leastOneLetters){
            return leastTwoLetters/2;
        } else{
            return leastOneLetters;
        }
    }
}