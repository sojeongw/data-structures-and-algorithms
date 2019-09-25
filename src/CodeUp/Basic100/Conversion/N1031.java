package CodeUp.Basic100.DataType;

import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;

public class N1031 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = Integer.toOctalString(Integer.parseInt(br.readLine()));
        System.out.println(a);
    }
}
