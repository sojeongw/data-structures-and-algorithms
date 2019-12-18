package BaekjoonOnlineJudge.StepByStep.String;

import java.io.*;

public class CroatiaAlphabet_2941_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // sout 하면 80ms, bw 하면 76ms

        String input = br.readLine();
        br.close();
        String[] croatia = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        for(int i=0; i<croatia.length; i++){
            input = input.replace(croatia[i], "x");
        }

        bw.write(input.length()+"");
        bw.close();
    }
}