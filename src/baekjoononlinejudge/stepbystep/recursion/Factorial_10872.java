package baekjoononlinejudge.stepbystep.recursion;

import java.io.*;

public class Factorial_10872 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int input = Integer.parseInt(br.readLine());
        br.close();

        bw.write(String.valueOf(calFac(input)));
        bw.close();
    }

    static int calFac(int input){
        if(input==1 || input==0){
            return 1;
        }else{
            return input * calFac(input-1);
        }
    }
}
