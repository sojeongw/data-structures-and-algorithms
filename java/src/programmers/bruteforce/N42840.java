package programmers.bruteforce;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class N42840 {
    public static void main(String[] args) {
        System.out.println("Solution.solution = " + Arrays.toString(Solution.solution(new int[]{1, 2, 3, 4, 5})));
        System.out.println("Solution.solution = " + Arrays.toString(Solution.solution(new int[]{1, 3, 2, 4, 2})));
    }

    static class Solution {
        public static int[] solution(int[] answers) {
            int[] number1 = {1, 2, 3, 4, 5};
            int[] number2 = {2, 1, 2, 3, 2, 4, 2, 5};
            int[] number3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};


            int[] count = new int[3];
            for (int i = 0; i < answers.length; i++) {
                int answer1 = number1[i % number1.length];

                if (answer1 == answers[i]) {
                    count[0]++;
                }

                int answer2 = number2[i % number2.length];
                if (answer2 == answers[i]) {
                    count[1]++;
                }

                int answer3 = number3[i % number3.length];
                if (answer3 == answers[i]) {
                    count[2]++;
                }
            }

            int max = Arrays.stream(count).max().getAsInt();
            List<Integer> answer = new ArrayList<>();

            for (int i = 0; i < count.length; i++) {
                if (count[i] == max) {
                    answer.add(i + 1);
                }
            }

            return answer.stream().mapToInt(i -> i).toArray();
        }
    }
}
