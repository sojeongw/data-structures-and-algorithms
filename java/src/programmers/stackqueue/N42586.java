package programmers.stackqueue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;

public class N42586 {

    public static void main(String[] args) {
        int[] solution = Solution.solution(new int[]{93, 30, 55}, new int[]{1, 30, 5});
        System.out.println("solution = " + Arrays.toString(solution));
    }

    static class Solution {
        public static int[] solution(int[] progresses, int[] speeds) {
            List<Integer> answer = new ArrayList<>();
            Deque<Integer> queue = new ArrayDeque<>();

            for (int i = 0; i < progresses.length; i++) {
                int remain = 100 - progresses[i];
                queue.offer((int) Math.ceil((double) remain / speeds[i]));
            }

            while (!queue.isEmpty()) {
                int count = 1;
                int prev = queue.poll();

                while (!queue.isEmpty() && queue.peek() <= prev) {
                    queue.poll();
                    count++;
                }
                answer.add(count);
            }

            return answer.stream().mapToInt(value -> value).toArray();
        }
    }
}
