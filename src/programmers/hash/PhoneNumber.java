package programmers.hash;

import java.util.HashMap;
import java.util.Map;

public class PhoneNumber {
    public static void main(String[] args) {
        boolean answer = true;
        String[] phone_book = {"119", "97674223", "1195524421"};

        Map<String, Integer> hash = new HashMap<>();

        for(String arg : phone_book){
            hash.put(arg, 1);
        }

        for(int i=0; i<phone_book.length; i++){
            for(String arg : phone_book){
                hash.put(phone_book[i],hash.get(arg)-1);
                System.out.println(hash);
            }
        }



    }
}
