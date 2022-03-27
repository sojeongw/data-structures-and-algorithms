package baekjoononlinejudge.stepbystep.alignment;

import java.io.*;

public class AlignNumber_2750_2 {
    public static void main(String[] args) throws IOException {
        // 삽입 정렬 96ms

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        br.close();

        insertionSort(arr);

        for(int a : arr){
            bw.write(a + "\n");
        }
        bw.close();
    }

    static void insertionSort(int[] arr){
        int temp = 0;
        int j = 0;

        for(int i=1; i<arr.length; i++){
            temp = arr[i];

            for(j=i-1; j>=0 && temp<arr[j]; j--){
                arr[j+1] = arr[j];
            }
            arr[j+1] = temp;
        }
    }
}