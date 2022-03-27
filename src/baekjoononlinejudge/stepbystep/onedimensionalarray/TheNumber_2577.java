package baekjoononlinejudge.stepbystep.onedimensionalarray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TheNumber_2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        br.close();

        String abc = Integer.toString(a * b * c);
        int[] count = new int[10];

        for(int i=0; i<abc.length(); i++){
            // char를 int로 변환하는 법
            // abc의 각 자리값이 결국 count의 index라는 게 포인트
            count[abc.charAt(i) - '0']++;
        }

        for(int i=0; i<count.length; i++){
            System.out.println(count[i]);
        }
    }
}
