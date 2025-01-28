package programmers.basic;

import java.util.Arrays;

public class N120833 {
    public static void main(String[] args) {
        int[] answer = solution(new int[]{1, 3, 5}, 1, 2);
        System.out.println("answer = " + Arrays.toString(answer));
    }

    public static int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2-num1+1];

        int idx = 0;
        for (int i = num1; i <= num2; i++) {
            answer[idx] = numbers[i];
            idx++;
        }

        return answer;
    }
}
