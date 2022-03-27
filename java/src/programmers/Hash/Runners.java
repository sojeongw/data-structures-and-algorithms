package programmers.Hash;

import java.util.*;
class Runners {
    public static void main(String[] args) {
        String answer = "";

        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};

        Runners r = new Runners();
        answer = r.Solution(participant, completion);

        System.out.println(answer);
    }
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

}

