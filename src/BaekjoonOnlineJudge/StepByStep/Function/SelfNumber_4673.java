package BaekjoonOnlineJudge.StepByStep.Function;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class SelfNumber_4673 {
    // 10000보다 작거나 같은 셀프 넘버 개수
    static int range = 10000;
    // 생성자가 있는지 체크하는 배열. 1부터 시작하니까 인덱스를 맞추기 위해 +1을 한다.
    static int[] hasConst = new int[range+1];

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for(int i=1; i<=range; i++){
            // 10000보다 작거나 같은 숫자들을 하나씩 체크한다.
            checkSelfNum(i);
        }

        for(int i=1; i<=range; i++){
            if(hasConst[i]==0){
                bw.write(String.valueOf(i) + "\n");
            }
        }

        bw.close();
    }
    private static void checkSelfNum(int n){
        int result = n;

        // 처음엔 4자리까지 if문으로 10단위씩 올리면서 계산해야 했는데
        // 자리수에 상관없이 while 문으로 계속 구할 수 있음.
        while(n != 0){
            int mod = n % 10;
            n /= 10;
            result += mod;
        }

        if(result <= range){
            // 범위에 들어오는 수는 1로 체크, 즉 0인 숫자는 셀프 넘버다.
            hasConst[result] = 1;
        }
    }
}
