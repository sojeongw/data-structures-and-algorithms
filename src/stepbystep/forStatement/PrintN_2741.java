package stepbystep.forStatement;

import java.util.Scanner;

public class PrintN_2741 {
	public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        int n= kb.nextInt();
        
        if(n<=100000){
            for(int i=0; i<n; i++){
            System.out.println(i+1);
        }
        }
        
    }
}
