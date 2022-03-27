package baekjoononlinejudge.stepbystep.onedimensionalarray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MinMax_10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 엔터로 끝난 값만 들어감
        String n = br.readLine();

        // 엔터 후 입력된 값들만 들어감
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        // 2147483647, -2147483648
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        while(st.hasMoreTokens()){
            int input = Integer.parseInt(st.nextToken());
            if(input > max) max = input;
            if(input < min) min = input;
        }

        System.out.println(min + " " + max);
        br.close();
    }
}
