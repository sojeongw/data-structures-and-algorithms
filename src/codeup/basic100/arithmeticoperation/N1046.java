package codeup.basic100.arithmeticoperation;

import java.util.Scanner;

public class N1046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(a+b+c);
        System.out.format("%.01f", (float)(a+b+c)/3);
    }
}
