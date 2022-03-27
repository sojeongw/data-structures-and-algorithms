package codeup.basic100.io;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class N1019 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] a = input.split("\\.");
        System.out.format("%04d.%02d.%02d\n", Integer.parseInt(a[0]), Integer.parseInt(a[1]), Integer.parseInt(a[2]));
    }
}
