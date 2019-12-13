package BaekjoonOnlineJudge.StepByStep.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class WordCounter_1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int count = 0;

        while(st.hasMoreTokens()){
            // nextToken을 해줘야 토큰이 빠져나간다.
            st.nextToken();
            count++;
        }
        System.out.println(count);
    }
}
