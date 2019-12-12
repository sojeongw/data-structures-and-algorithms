package BaekjoonOnlineJudge.StepByStep.String;

import java.util.Scanner;

public class Repetition_2675 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();

        for (int i = 0; i < testcase; i++) {
            int repeat = sc.nextInt();
            String input = sc.next();

            for(int j=0; j<input.length(); j++){
                for(int k=0; k<repeat; k++){
                System.out.print(input.charAt(j));
                }
            }
            System.out.println();
        }
    }
}
