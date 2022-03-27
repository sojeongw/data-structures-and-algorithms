package codeup.basic100.problems;

import java.util.Scanner;

public class N1083 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            if(i==3 || i==6 || i==9){
                System.out.print("X ");
            }else{
                System.out.print(i + " ");
            }
        }
    }
}
