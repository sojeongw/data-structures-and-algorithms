package BaekjoonOnlineJudge.StepByStep.Alignment;

import java.io.*;
import java.util.Arrays;

public class AlignNumber2751 {
    // 병합 정렬
    static int[] result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] inputList = new int[Integer.parseInt(br.readLine())];
        result = new int[inputList.length];

        for(int i=0; i<inputList.length; i++){
            inputList[i] = Integer.parseInt(br.readLine());
        }

        mergeSort(inputList, 0, inputList.length-1);

        for(int i : result){
            bw.write("\n" + i);
        }
        br.close();
        bw.close();
    }

    // 배열을 가져와서 1개 단위로 쪼갠다.
    public static void mergeSort(int[] arr, int left, int right) {
        int mid;
        if(left < right) {
            mid = (left+right)/2;
            // 맨 앞의 0번쨰, 1번째 인덱스가 하나로 쪼개질 때까지 나눈다.
            mergeSort(arr, left, mid);
            mergeSort(arr, mid+1, right);
            // 다 쪼개면 하나로 합친다.
            merge(arr, left, mid, right);
        }
    }

    public static void merge(int[] arr, int left, int mid, int right) {
        // 쪼개진 첫 번째 배열의 첫 인덱스
        int l = left;
        // 쪼개진 두 번째 배열의 첫 인덱스
        int m = mid + 1;
        // 새로 삽입될 배열의 인덱스
        int k = left;

        // 쪼개진 두 배열의 원소를 비교하면서 새로운 배열에 넣는다.
        while(l <= mid || m<=right) {
            // 두 배열 모두 비교가 필요한 원소가 남아있다면
            if (l <= mid && m <= right) {
                // 첫번째 배열과 두번쨰 배열의 현재 인덱스를 비교해서 더 작은 걸 넣는다.
                if(arr[l] <= arr[m]) result[k] = arr[l++];
                else result[k] = arr[m++];
            }
            // 두번째 배열에 비교할 원소가 없다면
            else if(l <= mid && m > right) result[k] = arr[l++];
            // 첫번째 배열에 비교할 원소가 없다면
            else result[k] = arr[m++];
            k++;
        }
        for(int i=left; i<right+1; i++){
            arr[i] = result[i];
        }
        System.out.println("병합 정렬 후: " + Arrays.toString(arr));
    }
}
