package programmers.basic;

import java.util.HashMap;
import java.util.Map;

public class N120838 {

    public static void main(String[] args) {
        String result = Solution.solution(".--. -.-- - .... --- -.");
        System.out.println("result = " + result);
    }

    static class Solution {
        public static String solution(String letter) {
            String[] arr = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
            Map<String, Character> map = new HashMap<>();

            for (int i = 0; i < arr.length; i++) {
                map.put(arr[i], (char) (i + 97));
            }

            StringBuilder sb = new StringBuilder();
            String[] letters = letter.split(" ");
            for (String s : letters) {
                Character answer = map.get(s);
                sb.append(answer);
            }

            return sb.toString();
        }
    }
}


