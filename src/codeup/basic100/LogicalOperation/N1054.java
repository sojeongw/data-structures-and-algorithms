package CodeUp.Basic100.LogicalOperation;

import java.util.Scanner;

public class N1054 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println((a == b && a == 1) ? 1 : 0);
    }
}
