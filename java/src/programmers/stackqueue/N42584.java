package programmers.stackqueue;

import java.util.Arrays;

public class N42584 {
    public static void main(String[] args) {
        int[] solution = Solution.solution(new int[]{1, 2, 3, 2, 3});
        System.out.println("solution = " + Arrays.toString(solution));
    }

    static class Solution {
        public static int[] solution(int[] prices) {
            int[] answer = new int[prices.length];

            for (int i = 0; i < prices.length; i++) {
                int count = 0;
                for (int j = i + 1; j < prices.length; j++) {
                    count++;
                    if (prices[i] > prices[j]) {
                        break;
                    }
                }
                answer[i] = count;
            }

            return answer;
        }
    }
}
