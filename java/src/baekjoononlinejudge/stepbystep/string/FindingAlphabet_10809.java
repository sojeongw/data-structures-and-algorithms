package baekjoononlinejudge.stepbystep.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class FindingAlphabet_10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        // 알파벳은 총 26개
        int[] alphabet = new int[26];
        Arrays.fill(alphabet, -1);

        for(int i=0; i<input.length(); i++){
            // 중복되는 알파벳은 패스한다.
            if(alphabet[(int) input.charAt(i)-97] != -1){
               continue;
            }
            alphabet[(int) input.charAt(i)-97] = i;
        }

        for(int i=0; i<alphabet.length; i++){
            System.out.print(alphabet[i] + " ");
        }
    }
}
