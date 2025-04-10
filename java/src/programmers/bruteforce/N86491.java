package programmers.bruteforce;

public class N86491 {
    public static void main(String[] args) {
        int solution = Solution.solution(new int[][]{{60, 50}, {30, 70}, {60, 30}, {80, 40}});
        System.out.println("solution = " + solution);
    }

    static class Solution {
        public static int solution(int[][] sizes) {
            int maxWidth = 0;
            int maxHeight = 0;

            for (int[] card : sizes) {
                maxWidth = Math.max(maxWidth, Math.max(card[0], card[1]));
                maxHeight = Math.max(maxHeight, Math.min(card[0], card[1]));
            }

            return maxWidth * maxHeight;
        }
    }
}
