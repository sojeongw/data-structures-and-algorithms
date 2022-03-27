package codeup.basic100.io;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class N1014 {
    public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String input = br.readLine();
            String[] a = input.split(" ");
            System.out.print(a[1] + " " + a[0]);

    }
}
