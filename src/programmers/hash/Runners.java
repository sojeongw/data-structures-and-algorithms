package programmers.hash;

import java.util.*;
class Runners {
    public String Solution(String[] participant, String[] completion) {
        String answer = "";
        Arrays.sort(participant);
        Arrays.sort(completion);

        // 이 부분이 중요하다.
        int i =0;
        for(i =0; i<completion.length;i++){
            if(!participant[i].equals(completion[i])){
                return participant[i];
            }   
        }
        return participant[i];
    }

    public static void main(String[] args) {

    }
}

