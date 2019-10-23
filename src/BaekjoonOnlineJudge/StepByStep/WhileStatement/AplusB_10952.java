package BaekjoonOnlineJudge.StepByStep.WhileStatement;

import java.io.*;
import java.util.StringTokenizer;

public class AplusB_10952 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true){

            // 숫자를 입력 받는다
            StringTokenizer st = new StringTokenizer(br.readLine());

            // int로 변환한다
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            // 두 변 수가 다 0이면 종료한다
            if(a==0 && b==0){
                break;
            }else{
                // 계산해서 출력한다
                System.out.println(a+b);
            }
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
