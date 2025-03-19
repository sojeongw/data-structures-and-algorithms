package programmers.basic;

public class N120837 {
    public static void main(String[] args) {
        int answer = solution(999);
        System.out.println("answer = " + answer);
    }

    public static int solution(int hp) {
        int answer = 0;
        if ((hp % 5) % 3 == 1) {
            answer = hp / 5 + ((hp % 5) / 3) + 1;
        } else if ((hp % 5) % 3 == 0) {
            answer = hp / 5 + ((hp % 5) / 3);
        } else if (hp % 3 == 0) {
            answer = hp / 3;
        } else if (hp % 3 == 1) {
            answer = hp / 3 + 1;
        } else {
            answer = hp;
        }
        return answer;
    }
}
