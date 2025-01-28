package programmers.basic;

public class N120834 {

    public static void main(String[] args) {
        String answer = solution(100);
        System.out.println("answer = " + answer);
    }

    public static String solution(int age) {
        StringBuilder sb = new StringBuilder();

        int digit = 97;
        while (age > 0) {
            sb.insert(0, (char) (age % 10 + digit));
            age = age / 10;
        }

        return sb.toString();
    }
}
