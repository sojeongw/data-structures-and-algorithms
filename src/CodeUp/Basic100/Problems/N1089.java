package CodeUp.Basic100.Problems;

import java.util.Scanner;

public class N1089 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int d = sc.nextInt();
        int n = sc.nextInt();

        System.out.println(a+(n-1)*d);
    }
}
