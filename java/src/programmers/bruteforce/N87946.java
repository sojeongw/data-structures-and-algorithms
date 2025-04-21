package programmers.bruteforce;

public class N87946 {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int answer = solution.solution(80, new int[][]{{80, 20}, {50, 40}, {30, 10}});
        System.out.println("answer = " + answer);
    }

    static class Solution {

        private boolean[] visited;
        private int maxCount = 0;

        public int solution(int k, int[][] dungeons) {
            visited = new boolean[dungeons.length];
            dfs(k, dungeons, 0);

            return maxCount;
        }

        private void dfs(int k, int[][] dungeons, int count) {
            for (int i = 0; i < dungeons.length; i++) {
                int limit = dungeons[i][0];
                int cost = dungeons[i][1];

                if (!visited[i] && limit <= k) {
                    visited[i] = true;
                    dfs(k - cost, dungeons, count + 1);
                    visited[i] = false;
                }
            }
            maxCount = Math.max(maxCount, count);
        }
    }
}
