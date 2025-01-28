package programmers.basic;

import java.util.Arrays;

public class N120835 {
    public static void main(String[] args) {
        int[] answer = solution(new int[]{30, 10, 23, 6, 100});
        System.out.println("answer = " + Arrays.toString(answer));
    }

    public static int[] solution(int[] emergency) {
        int[][] sortEmergency = new int[emergency.length][2];

        for (int i = 0; i < emergency.length; i++) {
            sortEmergency[i][0] = emergency[i];
            sortEmergency[i][1] = i;
        }

        Arrays.sort(sortEmergency, (a,b) -> Integer.compare(b[0], a[0]));

        int[] rank = new int[emergency.length];
        for (int i = 0; i <rank.length; i++) {
            rank[sortEmergency[i][1]] = i + 1;
        }

        return rank;
    }
}
