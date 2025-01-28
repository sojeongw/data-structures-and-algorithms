package programmers.basic;

public class N120826 {
    public static void main(String[] args) {
        String answer = solution("BCBdbe", "B");
        System.out.println("answer = " + answer);
    }

    public static String solution(String my_string, String letter) {
        return my_string.replace(letter, "");
    }
}
