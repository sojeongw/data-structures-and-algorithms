package BaekjoonOnlineJudge.StepByStep.String;

import java.util.Scanner;

public class SumOfNumbers_11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        String input = sc.next();

        for (int i = 0; i < n; i++) {
            sum += Integer.parseInt(String.valueOf(input.charAt(i)));
        }

        System.out.println(sum);
    }
}
