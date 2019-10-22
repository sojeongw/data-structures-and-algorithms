package Programmers.Stack_Queue;

import java.util.ArrayList;
import java.util.List;

public class Printer3 {public static void main(String[] args) {
    int[] priorities = {1, 1, 9, 1, 1, 1};
    int location = 0;

    Printer3 p = new Printer3();
    System.out.println(p.solution(priorities, location));
}
    public int solution(int[] priorities, int location) {
        List<Integer> list = new ArrayList<>();
        for (int priority : priorities) {
            list.add(priority);
        }

        int answer = 1;
        while (!list.isEmpty()) {
            final Integer j = list.get(0);
            // 우선순위가 더 높은 게 있는지 확인 한 후
            if (list.stream().anyMatch(v -> j < v)) {
                list.add(list.remove(0));
            } else {
                // 지금이 제일 우선순위가 높다면 그게 내가 추가한 파일인지 확인한다.
                if (location == 0) {
                    return answer;
                }
                // 아니라면 list에서 빼고
                list.remove(0);
                // 순서가 뒤로 밀린다.
                answer++;
            }
            // 내가 추가한 파일이 첫번째가 아니라면
            if (location > 0) {
                // list가 빠졌으니 순서가 하나 땡겨진다.
                location--;
            } else {
                // 첫번째라면 맨 뒤로 갔으므로 size-1을 한다.
                location = list.size() - 1;
            }
        }

        throw new IllegalArgumentException();
    }
}
