package onboarding;

import java.util.HashMap;

public class Problem4 {
    public static String solution(String word) {
        String answer = "";

        HashMap<Character, Character> map = new HashMap<>();
        setValue(map);

        for (int i=0; i<word.length(); i++) {
            answer += map.get(word.charAt(i));
        }

        return answer;
    }

    public static void setValue(HashMap<Character, Character> map){
        map.put(' ', ' ');
        for (int i = 0; i < 26; i++){
            map.put((char)(65+i), (char)(90-i));
        }
        for (int i = 0; i < 26; i++){
            map.put((char)(97+i), (char)(122-i));
        }
    }
}
