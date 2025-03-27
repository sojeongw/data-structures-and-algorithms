package programmers.hash;

import java.util.HashMap;
import java.util.Map;

public class N42578 {
    public static void main(String[] args) {
        int solution = Solution.solution(new String[][]{{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}});
        System.out.println("solution = " + solution);
    }

    static class Solution {
        public static int solution(String[][] clothes) {
            Map<String, Integer> map = new HashMap<>();

            for (String[] cloth : clothes) {
                map.put(cloth[1], map.getOrDefault(cloth[1], 0) + 1);
            }

            // (A의 개수 + 1) * (B의 개수 + 1) * ... * (N의 개수 + 1) - 1
            int combinations = 1;
            for (int count : map.values()) {
                combinations *= (count + 1);
            }

            return combinations - 1;
        }
    }
}
