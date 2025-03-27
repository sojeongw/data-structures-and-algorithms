package programmers.hash;

import java.util.HashMap;
import java.util.Map;

public class N1845 {

    public static void main(String[] args) {
        int solution = Solution.solution(new int[]{3, 3, 3, 2, 2, 2});
        System.out.println("solution = " + solution);
    }

    static class Solution {
        public static int solution(int[] nums) {
            Map<Integer, Integer> map = new HashMap<>();

            for (int num : nums) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }

            return Math.min(nums.length / 2, map.keySet().size());
        }
    }
}
