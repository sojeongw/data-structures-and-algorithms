package baekjoononlinejudge.stepbystep.onedimensionalarray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OXquiz_8958_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));   // 84ms
        int input = Integer.parseInt(br.readLine());
        String[] arr = new String[input];

        // 한 줄이 통째로 배열에 들어가는구나
        for (int i = 0; i < input; i++) {
            arr[i] = br.readLine();
        }
        br.close();

        for (int i = 0; i < arr.length; i++) {
            int score = 0;
            int total = 0;

            for (int j = 0; j < arr[i].length(); j++) {
                if (arr[i].charAt(j) == 'O') {
                    score++;
                    total += score;
                } else {
                    score = 0;
                }
            }
            System.out.println(total);
        }
    }
}
