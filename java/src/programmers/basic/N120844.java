package programmers.basic;

import java.util.Arrays;

public class N120844 {

    public static void main(String[] args) {
//        int[] answer = Solution.solution(new int[]{4, 455, 6, 4, -1, 45, 6}, "left");
        int[] answer = Solution.solution(new int[]{1, 2, 3}, "right");
        System.out.println("answer = " + Arrays.toString(answer));
    }

    static class Solution {
        public static int[] solution(int[] numbers, String direction) {
            int[] answer = new int[numbers.length];

            if (direction.equals("left")) {
                answer[answer.length - 1] = numbers[0];

                for (int i = 0; i < numbers.length - 1; i++) {
                    answer[i] = numbers[i + 1];
                }
            } else {
                answer[0] = numbers[numbers.length - 1];

                for (int i = 1; i < numbers.length; i++) {
                    answer[i] = numbers[i - 1];
                }
            }
            return answer;
        }
    }
}
