package CodeUp.Basic100;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class N1078 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int sum = 0;

        for(int i=1; i<=n; i++){
            if(i%2 == 0){
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
