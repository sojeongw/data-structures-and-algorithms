package programmers.basic;

public class N120842 {
    public static void main(String[] args) {
        int[][] solution = Solution.solution(new int[]{100, 95, 2, 4, 5, 6, 18, 33, 948}, 3);
    }

    static class Solution {
        public static int[][] solution(int[] num_list, int n) {
            int[][] answer = new int[num_list.length / n][n];

            int valueIndex = 0;

            for (int i = 0; i < num_list.length / n; i++) {
                for (int j = 0; j < n; j++) {
                    answer[i][j] = num_list[valueIndex];
                    valueIndex++;
                }
            }

            return answer;
        }
    }
}
