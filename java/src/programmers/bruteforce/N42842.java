package programmers.bruteforce;

import java.util.Arrays;

public class N42842 {

    static class Solution {
        public static void main(String[] args) {
            System.out.println("Solution.solution(10, 2) = " + Arrays.toString(Solution.solution(24, 24)));
        }

        public static int[] solution(int brown, int yellow) {
            int[] answer = new int[2];

            for (int h = 3; h < brown; h += 1) {
                if ((brown + yellow) % h == 0) {
                    int w = (brown + yellow) / h;
                    if (w >= h && (w - 2) * (h - 2) == yellow) {
                        answer[0] = w;
                        answer[1] = h;
                    }
                }
            }
            return answer;
        }
    }
}
