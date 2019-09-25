package _CodeUp._Basic100.InputOutput;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class N1018 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] output = input.split(":");
        System.out.println(output[0]+":"+output[1]);
    }
}
