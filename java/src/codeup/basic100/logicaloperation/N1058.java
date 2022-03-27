package codeup.basic100.logicaloperation;

import java.util.Scanner;

public class N1058 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println((a == 0 && b == 0) ? 1 : 0);
    }
}
