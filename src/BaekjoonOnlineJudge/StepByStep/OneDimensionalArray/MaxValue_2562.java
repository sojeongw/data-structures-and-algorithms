package BaekjoonOnlineJudge.StepByStep.OneDimensionalArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaxValue_2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int max = Integer.MIN_VALUE;
        int count = 0;

        for(int i=0; i<9; i++){
            int input = Integer.parseInt(br.readLine());
            if(input > max){
                max = input;
                count = i+1;
            }
        }

        System.out.println(max + "\n" + count);
        br.close();
    }
}
