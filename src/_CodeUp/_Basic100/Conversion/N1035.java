package _CodeUp._Basic100._datatype;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N1035 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.valueOf(br.readLine(),16);
        System.out.format("%o",a);
    }
}
