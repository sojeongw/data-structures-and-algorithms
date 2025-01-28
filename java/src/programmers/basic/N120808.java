package programmers.basic;

import java.util.Arrays;

public class N120808 {
    public static void main(String[] args) {
        int[] answer = solution(9, 2, 1, 3);
        System.out.println("Arrays.toString(answer) = " + Arrays.toString(answer));
    }

    public static int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int numer3 = numer1 * denom2 + numer2 * denom1;
        int denom3 = denom1 * denom2;


        // 최대 공약수를 구한다.
        int gcd = gcd(numer3, denom3);
        numer3 /= gcd;
        denom3 /= gcd;

        return new int[]{numer3, denom3};
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
