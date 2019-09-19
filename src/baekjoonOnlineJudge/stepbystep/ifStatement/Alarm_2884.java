package baekjoonOnlineJudge.stepbystep.ifStatement;

import java.util.Scanner;

public class Alarm_2884 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
       
        if(m-45<0){
            if(h-1<0){
             h = 24;   
            }
            h = h-1;
            m = 60-(45-m);
            System.out.println(h + " " + m);
        }else{
            System.out.println(h + " "+ (m-45));
        }
    }
}
