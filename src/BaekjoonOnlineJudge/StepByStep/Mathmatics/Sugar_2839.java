package BaekjoonOnlineJudge.StepByStep.Mathmatics;

import java.io.*;

public class Sugar_2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int input = Integer.parseInt(br.readLine());
        int count = 0;

        while(true){
            if(input%5 == 0){
                count = count + input/5;
                break;
            }
            else if(input <= 0){    // 더 이상 나눌 수 없을 때
                count = -1;
                break;
            }
            // 3kg 짜리 하나 확보
            input -= 3;
            count++;
        }


        bw.write(String.valueOf(count));
        bw.close();
    }
}
