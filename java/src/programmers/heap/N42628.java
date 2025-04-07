package programmers.heap;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class N42628 {
    public static void main(String[] args) {
        int[] solution = Solution.solution(new String[]{"I -45", "I 653", "D 1", "I -642", "I 45", "I 97", "D 1", "D -1", "I 333"});
        System.out.println("solution = " + Arrays.toString(solution));
    }

    static class Solution {
        public static int[] solution(String[] operations) {
            PriorityQueue<Integer> minHeap = new PriorityQueue<>();
            PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
            Pattern pattern = Pattern.compile("(?<=I\\s)-?\\d+");

            for (String op : operations) {
                if (op.startsWith("I")) {
                    Matcher matcher = pattern.matcher(op);
                    if (matcher.find()) {
                        int num = Integer.parseInt(matcher.group());
                        minHeap.offer(num);
                        maxHeap.offer(num);
                    }
                } else if (op.equals("D -1")) {
                    if (!minHeap.isEmpty()) {
                        int min = minHeap.poll();
                        maxHeap.remove(min);
                    }
                } else if (op.equals("D 1")) {
                    if (!maxHeap.isEmpty()) {
                        int max = maxHeap.poll();
                        minHeap.remove(max);
                    }
                }
            }

            if (minHeap.isEmpty()) {
                return new int[]{0, 0};
            } else {
                return new int[]{maxHeap.peek(), minHeap.peek()};
            }
        }
    }
}
