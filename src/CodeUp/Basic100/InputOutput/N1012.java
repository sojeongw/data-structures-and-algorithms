package CodeUp.Basic100.InputOutput;

import java.util.Scanner;

public class N1012 {
    public static void main(String[] args) {
        float x;
        Scanner sc = new Scanner(System.in);

        x = sc.nextFloat();
        String str = String.format("%.6f",x);

        System.out.println(str);
        sc.close();
    }
}
