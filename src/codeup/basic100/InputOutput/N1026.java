package CodeUp.Basic100.InputOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N1026 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String[] b = a.split(":");

        System.out.format("%d", Integer.parseInt(b[1]));
    }
}
