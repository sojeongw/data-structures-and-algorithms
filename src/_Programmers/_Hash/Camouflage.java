package _Programmers._Hash;

import java.util.*;

public class Camouflage {
    public static void main(String[] args) {
        String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};

        Camouflage c = new Camouflage();

        System.out.println(c.solution(clothes));

    }

    public int solution(String[][] clothes) {
        int answer = 1;

        Map<String, Integer> map = new HashMap<>();

        for (String[] arr : clothes) {
            // 중요한건 경우의 수를 구하는 것이다. 옷 종류의 수를 일단 구한다.
            map.put(arr[1], map.getOrDefault(arr[1], 0) + 1);
        }

        for (String item : map.keySet()) {
            // 한 종류를 하나씩 입는 경우의 수에 아예 안입는 경우의 수가 있으므로 +1을 한다.
            answer *= map.get(item)+1;
        }

        // 옷을 아예 안 입는 경우는 없으므로 -1을 한다.
        return answer - 1;
    }
}
