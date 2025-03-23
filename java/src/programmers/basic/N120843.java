package programmers.basic;

public class N120843 {
    public static void main(String[] args) {
        int solution = Solution.solution(new int[]{1, 2, 3, 4}, 2);
        System.out.println("solution = " + solution);
    }

    static class Solution {
        public static int solution(int[] numbers, int k) {
            // 모듈러 연산은 인덱스를 되돌려 원형으로 만들어준다.
            return numbers[(2 * (k - 1)) % numbers.length];
        }
    }
}
