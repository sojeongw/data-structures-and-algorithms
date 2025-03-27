package programmers.hash;

import java.util.HashMap;

public class N42577 {

    public static void main(String[] args) {
        boolean solution = Solution.solution(new String[]{"12", "123", "1235", "567", "88"});
        System.out.println("solution = " + solution);
    }

    static class Solution {
        public static boolean solution(String[] phone_book) {
            HashMap<String, Integer> map = new HashMap<>();

            for (String phone : phone_book) {
                map.put(phone, 1);
            }

            for (String phone : phone_book) {
                for (int i = 1; i < phone.length(); i++) {
                    if (map.containsKey(phone.substring(0, i))) {
                        return false;
                    }
                }
            }

            return true;
        }
    }
}
