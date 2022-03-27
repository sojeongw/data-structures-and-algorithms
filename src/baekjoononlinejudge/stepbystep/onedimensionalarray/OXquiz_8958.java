package baekjoononlinejudge.stepbystep.onedimensionalarray;

import java.io.IOException;
import java.util.Scanner;

public class OXquiz_8958 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);    // 128ms
        int input = sc.nextInt();
        String[] arr = new String[input];

        // 한 줄이 통째로 배열에 들어가는구나
        for (int i = 0; i < input; i++) {
            arr[i] = sc.next();
        }
        sc.close();

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
