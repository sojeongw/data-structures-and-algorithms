package _BaekjoonOnlineJudge._StepByStep._ForStatement;

import java.util.Scanner;

public class Sum_8393 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        int n = sc.nextInt();
        int sum = 0;
        
        for(int i=0; i<n; i++){
           sum += i+1;
        }
        
        System.out.println(sum);
        sc.close();
        
    }
}
