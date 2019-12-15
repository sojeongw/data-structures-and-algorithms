package BaekjoonOnlineJudge.StepByStep.String;

import java.util.Scanner;

public class Sangsu_2908 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder first = new StringBuilder(sc.next());
        StringBuilder second = new StringBuilder(sc.next());
        int a = Integer.parseInt(first.reverse().toString());
        int b = Integer.parseInt(second.reverse().toString());

        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }
}
