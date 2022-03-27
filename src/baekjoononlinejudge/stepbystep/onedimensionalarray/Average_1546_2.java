package baekjoononlinejudge.stepbystep.onedimensionalarray;

import java.util.Scanner;

public class Average_1546_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int total = 0;
        int max = 0;
        int score;

        // 모든 항이 M*100으로 나누므로 점수를 다 더해서 한 방에 나눠도 된다.
        for(int i=0; i<n; i++){
            score = sc.nextInt();
            total += score;
            if(score>max){
                max = score;
            }
        }
        sc.close();

        double avg = 0;
        // 연산 우선순위가 같을 경우 맨 앞부터 계산하므로 100.0을 맨 앞에 두고 소수점으로 계산하게 만든다.
        avg = 100.0 * total / max / n;
        System.out.printf("%.2f", avg);
    }}
