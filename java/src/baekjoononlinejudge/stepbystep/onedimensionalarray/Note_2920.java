package baekjoononlinejudge.stepbystep.onedimensionalarray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Note_2920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());
        int[] arr = new int[str.countTokens()];

        for(int i=0; i<arr.length; i++){
            arr[i] = Integer.parseInt(str.nextToken());
        }

        String output = "";
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] == arr[i+1] + 1 ){
                // count를 굳이 만들 필요 없이 descending에 해당하면 계속 이 값이 output에 저장된다.
                output = "descending";
            }else if(arr[i] == arr[i+1] - 1){
                output = "ascending";
            }else{
                output = "mixed";
                // 한 번만 달라도 mixed이므로 바로 빠져나온다.
                break;
            }
        }

        System.out.println(output);
        br.close();
    }
}
