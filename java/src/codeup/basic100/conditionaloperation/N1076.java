package codeup.basic100.conditionaloperation;

import java.util.Scanner;

public class N1076 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        char t = 'a';

        while(t<=a){
            System.out.print(t + " ");
            t++;
        }
    }
}
