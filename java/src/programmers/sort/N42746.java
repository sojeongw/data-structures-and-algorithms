package programmers.sort;

import java.util.Arrays;

public class N42746 {
    public static void main(String[] args) {
        String solution = Solution.solution(new int[]{3, 30, 34, 5, 9});
        System.out.println("solution = " + solution);
    }

    static class Solution {
        public static String solution(int[] numbers) {
            String[] stringNumbers = new String[numbers.length];

            for (int i = 0; i < numbers.length; i++) {
                stringNumbers[i] = String.valueOf(numbers[i]);
            }

            Arrays.sort(stringNumbers, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));

            if (stringNumbers[0].equals("0")) {
                return "0";
            }

            StringBuilder sb = new StringBuilder();
            for (String stringNumber : stringNumbers) {
                sb.append(stringNumber);
            }

            return sb.toString();
        }
    }
}
