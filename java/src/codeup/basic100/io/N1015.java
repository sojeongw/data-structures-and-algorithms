package codeup.basic100.io;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class N1015 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        float f = Float.parseFloat(br.readLine());
        String str = String.format("%.2f", f);
        System.out.println(str);
    }
}
