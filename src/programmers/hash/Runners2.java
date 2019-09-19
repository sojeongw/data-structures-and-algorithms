package programmers.hash;

import java.util.*;

class Runners2 {
    public String solution(String[] participant, String[] completion){
        Map<String, Integer> hash = new HashMap<>();

        /* getOrDefault(Object key, V defaultValue)
        Returns the value to which the specified key is mapped,
        or defaultValue if this map contains no mapping for the key. */
        /* put(K key, V value)
        Associates the specified value with the specified key in this map */

        // hash의 key는 String arg, value는 +1이 된다. 즉, 중복값이 나오면 value는 2가 된다.
        for(String arg:participant) hash.put(arg, hash.getOrDefault(arg, 0)+1);
        // participant와 같으면 결국 value는 0이 된다.
        for(String arg:completion) hash.put(arg, hash.get(arg)-1);

        return null;
        }

    public static void main(String[] args) {

    }
}