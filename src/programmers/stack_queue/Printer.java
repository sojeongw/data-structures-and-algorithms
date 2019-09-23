package programmers.stack_queue;

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

        // 인쇄 대기목록의 가장 앞에 있는 문서(J)를 대기목록에서 꺼냅니다.


        // 나머지 인쇄 대기목록에서 J보다 중요도가 높은 문서가 한 개라도 존재하면
        for(int i=0; i<priorities.length; i++){
            if(priorities[0]<priorities[i]) {
                int tmp = priorities[0];
                priorities = queue(priorities, tmp);
                count++;
            }
        }
        answer = location - count;

        return answer;
    }
    // J를 대기목록의 가장 마지막에 넣습니다.
    public int[] queue(int[] priorities, int tmp){
        for(int i=0; i<priorities.length-2; i++){
            priorities[i] = priorities[i+1];
            priorities[priorities.length-1] = tmp;
        }
        return priorities;
    }
}
