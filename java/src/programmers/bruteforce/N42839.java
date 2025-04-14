package programmers.bruteforce;

import java.util.HashSet;
import java.util.Set;

public class N42839 {
    public static void main(String[] args) {
        int solution = Solution.solution("011");
        System.out.println("solution = " + solution);
    }

    static class Solution {
        public static int solution(String numbers) {
            int answer = 0;
            Set<Integer> results = new HashSet<>();

            for (int i = 1; i <= numbers.length(); i++) {
                calculate("", numbers, i, results);
            }
            return results.size();
        }

        static private void calculate(String result, String remaining, int length, Set<Integer> results) {
            if (result.length() == length && primeNumber(Integer.parseInt(result))) {
                results.add(Integer.parseInt(result));
                return;
            }

            for (int i = 0; i < remaining.length(); i++) {
                char ch = remaining.charAt(i);
                String second = remaining.substring(0, i) + remaining.substring(i + 1);
                calculate(result + ch, second, length, results);
            }
        }

        static private boolean primeNumber(int number) {
            if (number <= 1) return false;
            if (number == 2) return true;
            if (number % 2 == 0) return false;

            for (int i = 3; i * i <= number; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
