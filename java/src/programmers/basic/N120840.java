package programmers.basic;

public class N120840 {

    public static void main(String[] args) {
        long solution = Solution.solution(3, 2);
        System.out.println("solution = " + solution);
    }

    // 30!까지 하면 오버플로우가 발생할 수 있어 재귀는 위험하다.
    static class Solution {

        private static long[][] memo = new long[31][31];

        public static long solution(int balls, int share) {
            return combination(balls, share);
        }

        private static long combination(int n, int r) {
            if (r == 0 || n == r) return 1;

            // 이미 계산한 값이 있다면 재사용
            if (memo[n][r] != 0) return memo[n][r];

            // 계산하고 저장
            return memo[n][r] = combination(n - 1, r - 1) + combination(n - 1, r);
        }


    }
}
