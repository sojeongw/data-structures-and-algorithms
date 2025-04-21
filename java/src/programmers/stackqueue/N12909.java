package programmers.stackqueue;

import java.util.ArrayDeque;
import java.util.Deque;

public class N12909 {
    public static void main(String[] args) {
        boolean solution = Solution.solution("(()(");
        System.out.println("solution = " + solution);
    }

    static class Solution {
        static boolean solution(String s) {
            Deque<Object> queue = new ArrayDeque<>();

            for (char c : s.toCharArray()) {
                if (c == '(') {
                    queue.offer(c);
                } else if (c == ')') {
                    Object result = queue.poll();
                    if (result == null) {
                        return false;
                    }
                }
            }

            if (queue.isEmpty()) {
                return true;
            }
            return false;
        }
    }
}
