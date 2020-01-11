package BaekjoonOnlineJudge.StepByStep.Function;

import java.io.*;

public class Sequence_1065 {
    static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        // 어차피 두 자리 수 까지는 다 한수이다.
        if (n < 100) {
            count = n;
        } else {
            count = 99;
            for (int i = 100; i <= n; i++) {
                calSequence(i);
            }
        }
        bw.write(String.valueOf(count));
        bw.close();
    }

    static void calSequence(int n) {
        int a = n / 100;
        int b= (n / 10) % 10;
        int c = n % 10;

        if (a-b == b-c) {
            count++;
        }
    }
}