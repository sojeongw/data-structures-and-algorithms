package codeup.basic100.datatype;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N1028 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseUnsignedInt(br.readLine());    // -2147483648
        System.out.println(Integer.toUnsignedString(a));    // 2147483648
    }
}
