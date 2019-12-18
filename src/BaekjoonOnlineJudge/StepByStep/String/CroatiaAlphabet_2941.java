package BaekjoonOnlineJudge.StepByStep.String;

import java.io.*;

public class CroatiaAlphabet_2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        int count = input.length();

        // 런타임 에러
        for(int i=0; i<input.length(); i++){
            if(input.charAt(i)=='d' && input.substring(i, i+3).equals("dz=")){
                count--;
            }else if(input.charAt(i)=='=' || input.charAt(i)=='-'){
                count--;
            }else if((input.charAt(i)=='l' || input.charAt(i)=='n') && input.charAt(i+1)=='j'){
                count--;
            }
        }
        System.out.println(count);
    }
}