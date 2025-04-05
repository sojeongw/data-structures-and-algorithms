package programmers.heap;

import java.util.PriorityQueue;
import java.util.Queue;

public class N42626 {
    public static void main(String[] args) {
        int solution = Solution.solution(new int[]{0, 0, 0, 0}, 1);
        System.out.println("solution = " + solution);
    }

    static class Solution {
        public static int solution(int[] scoville, int K) {
            int answer = 0;
            Queue<Integer> queue = new PriorityQueue<>();

            for (int i : scoville) {
                queue.offer(i);
            }

            while (!queue.isEmpty() && queue.peek() < K) {
                Integer first = queue.poll();
                Integer second = queue.poll();

                if (second == null) {
                    return -1;
                }

                int result = first + (second * 2);
                queue.offer(result);
                answer++;
            }

            return answer;
        }
    }
}
