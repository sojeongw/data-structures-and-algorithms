package CodeUp.Basic100.Problems;

import java.util.Scanner;

public class N1085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double h = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double s = sc.nextDouble();

        // 계산해서 bit을 byte로 바꿔주고
        double cal = h*b*c*s/8;

        // KB -> MB로 변환 뒤 출력한다.
        System.out.printf("%.1f MB", cal/1024/1024);
    }
}
