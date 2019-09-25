package _CodeUp._Basic100.InputOutput;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class N1020 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] a = str.split("-");
        System.out.println(a[0]+a[1]);
    }
}
