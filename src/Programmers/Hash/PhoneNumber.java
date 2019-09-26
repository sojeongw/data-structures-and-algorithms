package Programmers.Hash;

import java.util.HashMap;
import java.util.Map;

public class PhoneNumber {
    public static void main(String[] args) {
        boolean answer = true;
        String[] phone_book = {"119", "97674223", "1195524421"};

        PhoneNumber pn = new PhoneNumber();
        answer = pn.solution(phone_book);

        System.out.println(answer);
    }

    public boolean solution(String[] phone_book) {
        boolean answer = true;

        Map<Integer, String> hash = new HashMap<>();

        int i = 1;
        for (String arg : phone_book) {
            hash.put(i, arg);
            i++;
        }

        for (String arg : phone_book) {
            int count = 0;
            for (String val : hash.values()) {
                if (val.startsWith(arg)) {
                    count++;
                }
            }
            if (count >= 2) {
                return false;
            }
        }
        return answer;
    }
}

