package BaekjoonOnlineJudge.StepByStep.WhileStatement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PlusCycle_1110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        int result = n;

        do {
            // 이전의 결과에 계속 덮어써야 하는데 그대신 n만 계속 계산하니 무한 루프가 돌 수밖에..!
            result = (result % 10) * 10 + (result / 10 + result % 10) % 10;
            count++;
        } while (result != n);

        System.out.println(count);
        br.close();
    }
}
