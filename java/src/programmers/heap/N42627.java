package programmers.heap;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class N42627 {
    public static void main(String[] args) {
        int solution = Solution.solution(new int[][]{{0, 3}, {1, 9}, {3, 5}});
        System.out.println("solution = " + solution);
    }

    static class Solution {
        public static int solution(int[][] jobs) {
            PriorityQueue<int[]> queue = new PriorityQueue<>(Comparator.comparingInt((int[] a) -> a[1]).thenComparingInt(a -> a[0]));
            Arrays.sort(jobs, Comparator.comparingInt(a -> a[0]));

            int time = 0;
            int index = 0;
            int totalTurnAround = 0;
            while (index < jobs.length || !queue.isEmpty()) {
                while (index < jobs.length && jobs[index][0] <= time) {
                    queue.offer(jobs[index]);
                    index++;
                }

                if (!queue.isEmpty()) {
                    int[] current = queue.poll();
                    time += current[1];
                    totalTurnAround += time - current[0];
                } else {
                    time = jobs[index][0];
                }
            }

            return totalTurnAround / jobs.length;
        }
    }
}
