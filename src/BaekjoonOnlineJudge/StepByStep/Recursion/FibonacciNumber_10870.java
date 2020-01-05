package BaekjoonOnlineJudge.StepByStep.Recursion;

import java.io.*;

public class FibonacciNumber_10870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int result = fibonacci(Integer.parseInt(br.readLine()));

        bw.write(String.valueOf(result));
        bw.close();
    }

    static int fibonacci(int n){
        if(n<2){
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
