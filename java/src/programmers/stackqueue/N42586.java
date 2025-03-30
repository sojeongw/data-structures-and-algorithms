package programmers.stackqueue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;

public class N42586 {

    public static void main(String[] args) {
        int[] solution = Solution.solution(new int[]{95, 90, 99, 99, 80, 99}, new int[]{1, 1, 1, 1, 1, 1});
        System.out.println("solution = " + Arrays.toString(solution));
    }

    static class Solution {
        public static int[] solution(int[] progresses, int[] speeds) {
            List<Integer> answer = new ArrayList<>();
            Deque<Integer> queue = new ArrayDeque<>();

            for (int i = 0; i < progresses.length; i++) {
                int remain = 100 - progresses[i];
                if (remain % speeds[i] != 0) {
                    queue.add(remain / speeds[i] + 1);
                } else {
                    queue.add(remain / speeds[i]);
                }
            }


            return answer.stream().mapToInt(value -> value).toArray();
        }
    }
}
