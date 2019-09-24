package CodeUp.Basic100.datatype;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N1034 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 입력 자체를 다른 진법으로 받을 때는 valueOF()
        int a = Integer.valueOf(br.readLine(),8);
        System.out.format("%d", a);
    }
}
