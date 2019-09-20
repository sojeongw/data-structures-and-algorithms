package programmers.hash;

import java.util.HashMap;
import java.util.Map;

public class PhoneNumber2 {

    public static void main(String[] args) {
        boolean answer = true;
        String[] phone_book = {"119", "97674223", "1195524421"};

        PhoneNumber pn = new PhoneNumber();
        answer = pn.solution(phone_book);

        System.out.println(answer);
    }

    public boolean solution(String[] phone_book) {
        boolean answer = true;

        for(int i=0; i<phone_book.length-1; i++) {
            for(int j=i+1; j<phone_book.length; j++) {
                if(phone_book[i].startsWith(phone_book[j])) {return false;}
                if(phone_book[j].startsWith(phone_book[i])) {return false;}
            }
        }
        return true;
    }
}

