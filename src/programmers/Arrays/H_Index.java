package Programmers.Arrays;

import java.util.Arrays;

public class H_Index {
    public static void main(String[] args) {
        int[] citations={3, 0, 6, 1, 5};

        System.out.println(new H_Index().solution(citations));
    }

    public int solution(int[] citations) {
        int answer = 0;
        int count = citations.length;

        Arrays.sort(citations);

        for(int i=0; i<citations.length; i++){
            if(citations[i] > answer){
                count++;
            }
        }

        return answer;
    }
}
