package codeup.basic100.problems;

import java.util.Scanner;

public class N1080 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 1;

        for(int i=1; i<=a; i++){
            sum += i;
            if(sum >= a){
                System.out.println(i);
                break;
            }
        }
    }
}
