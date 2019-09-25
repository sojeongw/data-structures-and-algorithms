package _BaekjoonOnlineJudge._StepByStep._IfStatement;

import java.util.Scanner;

public class ThreeNumbers_10817 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        int[] arr = new int[3];
        
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]<arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(arr[1]);
    }
}
