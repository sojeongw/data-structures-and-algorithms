package Programmers.StackQueue;

import java.util.Collections;
import java.util.PriorityQueue;

public class Printer {
    public static void main(String[] args) {
        int[] priorities = {1, 1, 9, 1, 1, 1};
        int location = 0;

        Printer p = new Printer();
        System.out.println(p.solution(priorities, location));
    }

    public int solution(int[] priorities, int location) {
        int answer = 0;
        int count = 0;

        // 숫자가 높은 것부터 내림차순으로 정렬
        PriorityQueue pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int p : priorities){
            pq.add(p);
        }

        System.out.println(pq);     // [9, 1, 1, 1, 1, 1]

        while(!pq.isEmpty()){
            for(int i=0; i<priorities.length; i++){
                // peek(): 우선순위가 가장 높은 요소를 삭제하지 않고 반환한다. object를 반환하므로 int로 변환한다.
                if(priorities[i] == (int)pq.peek()){
                    if(i == location){
                        return answer;
                    }
                    // poll(): 우선순위가 가장 높은 요소를 반환한 후 삭제한다.
                    pq.poll();
                    answer++;
                }
            }
        }

        return answer;
    }

}
