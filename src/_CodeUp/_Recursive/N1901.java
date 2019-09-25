package _CodeUp._Recursive;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class N1901 {
    static int num;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        num = Integer.parseInt(br.readLine());

        printNum(1);

    }

    public static void printNum(int i) {
        if (i <= num){
            System.out.println(i);
            i++;
            printNum(i);
        }
    }
}

