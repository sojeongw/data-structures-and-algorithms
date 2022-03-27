package codeup.basic100.datatype;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N1029 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double d = Double.parseDouble(br.readLine());
        System.out.format("%.11f", d);
    }
}
