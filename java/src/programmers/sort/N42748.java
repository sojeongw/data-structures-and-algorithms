package programmers.sort;

import java.util.Arrays;

public class N42748 {
    public static void main(String[] args) {
        int[] solution = Solution.solution(new int[]{1, 5, 2, 6, 3, 7, 4}, new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}});
        System.out.println("solution = " + Arrays.toString(solution));
    }

    static class Solution {
        public static int[] solution(int[] array, int[][] commands) {
            int[] answer = new int[commands.length];

            for (int i = 0; i < commands.length; i++) {
                int[] copy = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
                Arrays.sort(copy);
                int index = commands[i][2];
                answer[i] = (copy[index - 1]);
            }

            return answer;
        }
    }
}
