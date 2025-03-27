package programmers.hash;

import java.util.HashMap;
import java.util.Map;

public class N42576 {

    public static void main(String[] args) {
        String solution = Solution.solution(new String[]{"mislav", "stanko", "mislav", "ana"}, new String[]{"stanko", "ana", "mislav"});
        System.out.println("solution = " + solution);
    }

    static class Solution {
        public static String solution(String[] participant, String[] completion) {
            Map<String, Integer> participantMap = new HashMap<>();

            for (String name : participant) {
                participantMap.put(name, participantMap.getOrDefault(name, 0) + 1);
            }

            for (String name : completion) {
                participantMap.put(name, participantMap.get(name) - 1);
            }

            for (String key : participantMap.keySet()) {
                if (participantMap.get(key) > 0) {
                    return key;
                }
            }

            return null;
        }
    }
}
