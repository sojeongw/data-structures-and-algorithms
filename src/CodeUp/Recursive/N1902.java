package CodeUp.Recursive;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class N1902 {
    static int num;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        num = Integer.parseInt(br.readLine());

        printNum(num);

    }

    public static void printNum(int i) {
        if (i > 0){
            System.out.println(i);
            i--;
            printNum(i);
        }
    }
}
