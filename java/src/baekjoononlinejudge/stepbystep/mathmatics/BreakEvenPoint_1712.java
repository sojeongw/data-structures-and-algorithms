package baekjoononlinejudge.stepbystep.mathmatics;

import java.io.*;
import java.util.StringTokenizer;

public class BreakEvenPoint_1712 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        long c = Long.parseLong(st.nextToken());
        long result = 0;

        br.close();

        // b는 어차피 a 때문에 c보다 큰데 원래도 b가 c보다 크거나 같으면 의미기 없으므로 손익분기점이 없다.
        if(c <= b){
            result = -1;
        }else{
            // 부등식을 이항해서 계산하면 a/(c-b)가 판매 수보다 작아야 한다. 판매 수는 정수이므로 a/(c-b)보다 많이 팔려면 +1을 한다.
            result = a/(c-b) + 1;
        }

        bw.write(String.valueOf(result));
        bw.close();
    }
}