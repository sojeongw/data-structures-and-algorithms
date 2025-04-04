package programmers.stackqueue;

import java.util.ArrayDeque;
import java.util.Deque;

public class N42583 {
    public static void main(String[] args) {
        int solution = Solution.solution(2, 10, new int[]{7, 4, 5, 6});
        System.out.println("solution = " + solution);
    }

    static class Solution {
        public static int solution(int bridge_length, int weight, int[] truck_weights) {
            Deque<Integer> bridge = new ArrayDeque<>();

            for (int i = 0; i < bridge_length; i++) {
                bridge.offer(0);
            }

            int second = 0;
            int totalWeight = 0;
            int index = 0;
            while (!bridge.isEmpty()) {
                second++;

                Integer left = bridge.poll();
                totalWeight -= left;

                if (index < truck_weights.length) {
                    if (truck_weights[index] + totalWeight <= weight) {
                        int truckWeight = truck_weights[index];
                        bridge.offer(truckWeight);
                        totalWeight += truckWeight;
                        index++;
                    } else {
                        bridge.offer(0);
                    }
                }
            }

            return second;
        }
    }
}
