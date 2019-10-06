package CodeUp.Basic100.Problems;

import java.util.Scanner;

public class N1082 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next(), 16);

        for(int i=1; i<16; i++){
            System.out.format("%X" + "*" + "%X" + "=" + "%X\n", n, i, n*i);
        }

    }
}
