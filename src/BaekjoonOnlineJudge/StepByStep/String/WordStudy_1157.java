package BaekjoonOnlineJudge.StepByStep.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WordStudy_1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 어차피 대문자 기준으로 계산되니까 대문자로 변환한다.
        String input = br.readLine().toUpperCase();

        // 각 알파벳 마다 나온 횟수를 기록한다.
        int[] alphabet = new int[26];
        int max = 0;
        char result = '?';

        for (int i = 0; i < input.length(); i++) {
            alphabet[(int)input.charAt(i)-65]++;
            if(max < alphabet[(int)input.charAt(i)-65]){
                max = alphabet[(int)input.charAt(i)-65];
                result = input.charAt(i);
            }else if(max == alphabet[(int)input.charAt(i)-65]){
                // 지금까지 제일 많이 나온 개수가 현재 배열값(해당 알파벳이 나온 횟수)과 같으면 같은 개수인 것이 더 있다는 뜻이므로 ?로 설정한다.
                result = '?';
            }
        }
            System.out.println(result);
    }
}
