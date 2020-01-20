package BaekjoonOnlineJudge.StepByStep.Alignment;

import java.io.*;

public class AlignNumber_2750_3 {
    public static void main(String[] args) throws IOException {
        // 버블 정렬 96ms

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        br.close();

        sort(arr);

        for(int a : arr){
            bw.write(a + "\n");
        }
        bw.close();
    }

    static void sort(int[] arr){
        int temp = 0;

        for(int i=arr.length-1; i>0; i--){
            for(int j=0; j<i; j++){
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}