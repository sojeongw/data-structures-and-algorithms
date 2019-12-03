package BaekjoonOnlineJudge.StepByStep.OneDimensionalArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Modulo_3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[42];

        // 구한 나머지에 값이 쌓이도록 배열의 인덱스로 설정한다.
        // 문제를 풀 때 공통으로 나올 수 있는 게 무엇인지 고민하자.
        for(int i=0; i<10; i++){
            int input = Integer.parseInt(br.readLine());
            arr[input%42]++;
        }

        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]!=0){
                count++;
            }
        }
        System.out.println(count);
    }
}
