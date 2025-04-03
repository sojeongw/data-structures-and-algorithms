package programmers.stackqueue;

import java.util.ArrayDeque;
import java.util.Deque;

public class N42587 {
    public static void main(String[] args) {
        int solution = Solution.solution(new int[]{1, 1, 9, 1, 1, 1}, 0);
        System.out.println("solution = " + solution);
    }

    static class Solution {
        public static int solution(int[] priorities, int location) {
            Deque<int[]> queue = new ArrayDeque<>();

            for (int i = 0; i < priorities.length; i++) {
                queue.offer(new int[]{i, priorities[i]});
            }

            int order = 0;
            while (!queue.isEmpty()) {
                int[] current = queue.poll();
                boolean hasHigher = queue.stream().anyMatch(values -> values[1] > current[1]);

                if (hasHigher) {
                    queue.offer(current);
                } else {
                    if (current[0] == location) {
                        return order + 1;
                    }
                    order++;
                }
            }

            return -1;
        }
    }
}
