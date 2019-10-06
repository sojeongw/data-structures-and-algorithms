package CodeUp.Basic100.Problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N1084 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] arr= input.split(" ");
        int r = Integer.parseInt(arr[0]);
        int g = Integer.parseInt(arr[1]);
        int b = Integer.parseInt(arr[2]);
        int count = 0;

        for(int i=0; i<r; i++){
            for(int j=0; j<g; j++){
                for(int k=0; k<b; k++){
                    System.out.println(i + " " + j + " " + k);
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
