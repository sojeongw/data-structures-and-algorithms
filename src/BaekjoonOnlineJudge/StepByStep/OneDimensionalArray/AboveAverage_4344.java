package BaekjoonOnlineJudge.StepByStep.OneDimensionalArray;

import java.util.Scanner;

public class AboveAverage_4344 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 테스트 케이스의 수
        int c = sc.nextInt();

        int n, total, count;
        double avg;
        int[] scores = new int[1000];

        for(int i=0; i<c; ++i){
            // 학생 수
            n = sc.nextInt();
            total = 0;
            count = 0;
            for(int j=0; j<n; j++){
                scores[j] = sc.nextInt();
                total += scores[j];
            }
            avg = (float)total/n;
            for(int j=0; j<n; j++){
                if(scores[j]>avg){
                    count++;
                }
            }
            System.out.printf("%.3f", (float)count/n*100);
            System.out.println("%");
        }
    }
}
