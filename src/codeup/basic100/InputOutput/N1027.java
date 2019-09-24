package CodeUp.Basic100.InputOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N1027 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] a = s.split("\\.");
        System.out.format("%02d-%02d-%04d", Integer.parseInt(a[2]), Integer.parseInt(a[1]), Integer.parseInt(a[0]));
    }
}
