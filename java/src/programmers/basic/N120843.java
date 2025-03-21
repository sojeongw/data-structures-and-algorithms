package programmers.basic;

public class N120843 {
    public static void main(String[] args) {
        int solution = Solution.solution(new int[]{1, 2, 3}, 3);
        System.out.println("solution = " + solution);
    }

    static class Solution {
        public static int solution(int[] numbers, int k) {
            int index = (k - 1) * 2;
            int answer;

            if (index >= numbers.length) {
                answer = numbers[index - numbers.length];
            } else {
                answer = numbers[index];
            }

            return answer;
        }
    }
}
