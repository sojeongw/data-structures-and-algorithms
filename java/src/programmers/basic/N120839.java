package programmers.basic;

public class N120839 {

    public static void main(String[] args) {
        String solution = Solution.solution("205");
        System.out.println("solution = " + solution);
    }

    static class Solution {
        public static String solution(String rsp) {
            String[] splitRsp = rsp.split("");

            StringBuilder sb = new StringBuilder();

            for (String s : splitRsp) {
                String answer = check(s);
                sb.append(answer);
            }

            return sb.toString();
        }

        private static String check(String rsp) {
            return switch (rsp) {
                case "0" -> "5";
                case "2" -> "0";
                case "5" -> "2";
                default -> null;
            };
        }

    }
}
