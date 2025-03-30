package programmers.stackqueue;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class N12906 {

    public static void main(String[] args) {
        int[] solution = Solution.solution(new int[]{1, 1, 3, 3, 0, 1, 1});
        System.out.println("solution = " + Arrays.toString(solution));
    }

    static public class Solution {
        public static int[] solution(int[] arr) {
            Deque<Integer> answer = new ArrayDeque<>();

            for (int i : arr) {
                if (answer.isEmpty()) {
                    answer.add(i);
                } else if (!answer.peekLast().equals(i)) {
                    answer.add(i);
                }
            }

            return answer.stream().mapToInt(i -> i).toArray();
        }
    }
}
