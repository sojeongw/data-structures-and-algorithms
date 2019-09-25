package _CodeUp._Basic100.InputOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N1025 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String[] b = a.split("");
        for(int i=1; i<=b.length; i++){
            int result = Integer.parseInt(b[i-1]);
            System.out.println("[" + result*(int)Math.pow(10, b.length-i) + "]");
        }
    }
}
