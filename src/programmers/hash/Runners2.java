package programmers.hash;

import java.util.*;

class Runners2 {
    public static void main(String[] args) {
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};

        solution(participant, completion);

    }
    public static String solution(String[] participant, String[] completion){
        String answer = "";
        Map<String, Integer> hash = new HashMap<>();

        /* getOrDefault(Object key, V defaultValue)
        Returns the value to which the specified key is mapped,
        or defaultValue if this map contains no mapping for the key. */
        /* put(K key, V value)
        Associates the specified value with the specified key in this map */

        // hash의 key는 String arg, value는 +1이 된다. 만약 같은 key가 존재하면 그 value를 불러와서 거기에 +1을 한다. 즉, 동명이인이 나오면 value는 2가 된다.
        for(String arg:participant) hash.put(arg, hash.getOrDefault(arg, 0)+1);
        // participant와 같으면(요소가 겹치면) 결국 value는 0이 된다. 만약 겹치지 않는다면 1이 남게 된다.
        for(String arg:completion) hash.put(arg, hash.get(arg)-1);

        for (String key : hash.keySet()) {
            // 겹치는 사람이 0이 아니므로
            if (hash.get(key) != 0) {
                answer = key;
            }
        }
        System.out.println(answer);
        return answer;
        }

}