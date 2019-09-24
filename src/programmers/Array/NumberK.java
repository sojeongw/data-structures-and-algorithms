package Programmers.Array;

import java.util.Arrays;

public class NumberK {
    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2,5,3}, {4,4,1},{1,7,3}};

        NumberK nk = new NumberK();
        int[] answer = nk.solution(array, commands);

        for(int i : answer){
            System.out.println(i);
        }

    }
    public int[] solution(int[] arr, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i=0; i<commands.length; i++){
            // 자른 배열을 담을 새로운 배열
            int[] tmpArr = new int[commands[i][1] - commands[i][0] + 1];
            int idx = 0;

            for(int j = commands[i][0]-1; j < commands[i][1]; j++){
                tmpArr[idx] = arr[j];
                idx++;
            }

            Arrays.sort(tmpArr);

            answer[i] = tmpArr[commands[i][2]-1];

        }


        return answer;
    }


}
