package codeup.basic100.problems;

import java.util.Scanner;

public class N1087 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        for(int i=1; ; i++){
            sum += i;
            if(!(sum<n)){
                break;
            }
        }
        System.out.println(sum);
    }
}
