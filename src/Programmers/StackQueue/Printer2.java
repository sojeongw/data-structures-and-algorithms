package Programmers.StackQueue;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class Printer2 {
    public static void main(String[] args) {
        int[] priorities = {1,1,9,1,1,1};
        int location = 0;

        Printer2 p = new Printer2();
        System.out.println("result: " + p.solution(priorities, location));
    }

    public int solution(int[] priorities, int location) {
        int answer = 0;

        // ArrayDeque: front와 rear 양쪽에서 연산이 가능하며 LinkedList보다 빠르다.
        Queue<Paper> queue = new ArrayDeque<>();

        for (int i = 0; i < priorities.length; i++) {
            // 우선순위 별로 paper 객체를 생성한다.
            Paper p = new Paper(priorities[i]);
            // 내가 인쇄를 요청한 location 순서가 되면 true로 체크한다.
            if (i == location) {
                p.mine = true;
            }
            // 만든 객체를 queue에 넣는다.
            queue.add(p);
        }
        Arrays.sort(priorities);

        int idx = priorities.length - 1;
        answer = 1;
        while(!queue.isEmpty()){
            // queue에 담았던 paper 객체를 가져온다.
            Paper p = queue.poll();
            // priorities를 뒤에서부터 탐색한다.
            // paper 객체와 priorities의 값이 일치하고
            if(p.priority == priorities[idx]){
                // 내가 프린트를 걸었다면
                if(p.mine){
                    // answer를 반환한다.
                    return answer;
                }
                answer++;
                idx--;
            // 중요도가 일치하지 않으면
            }else{
                // 다시 queue에 넣는다. 즉, queue의 맨 뒤로 이동한다.
                queue.add(p);
            }
        }

        return answer;
    }
}

class Paper {
    int priority;
    boolean mine;

    Paper(int priority) {
        this.priority = priority;
        this.mine = false;
    }
}
