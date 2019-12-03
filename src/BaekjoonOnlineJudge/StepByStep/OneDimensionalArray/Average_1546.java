package BaekjoonOnlineJudge.StepByStep.OneDimensionalArray;

import java.io.IOException;
import java.util.Scanner;

public class Average_1546 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float[] arr = new float[n];
        float max = 0;
        float sum = 0;

        for(int i=0; i<n; i++){
            arr[i] = sc.nextFloat();
            if(arr[i]>max){
                max = arr[i];
            }
        }
        sc.close();

        for(int i=0; i<n; i++){
            arr[i] = arr[i]/max*100;
            sum += arr[i];
        }

        System.out.format("%.2f", sum/n);

    }
}
