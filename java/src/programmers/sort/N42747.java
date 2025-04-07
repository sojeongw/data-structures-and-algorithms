package programmers.sort;

import java.util.Arrays;

public class N42747 {
    public static void main(String[] args) {
        int solution = Solution.solution(new int[]{3, 0, 6, 1, 5});
        System.out.println("solution = " + solution);
    }

    static class Solution {
        public static int solution(int[] citations) {
            int answer = 0;
            for (int i = 0; i <= citations.length; i++) {
                int h = i;
                long over = Arrays.stream(citations).filter(value -> h <= value).count();

                if (over >= h) {
                    answer = h;
                }
            }

            return answer;
        }
    }
}
