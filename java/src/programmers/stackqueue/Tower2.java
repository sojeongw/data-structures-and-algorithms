package programmers.stackqueue;

import java.util.Arrays;

public class Tower2 {
    public static void main(String[] args) {
        int[] heights = {6,9,5,7,4};
        System.out.println(Arrays.toString(new Tower2().solution(heights)));
    }
    public int[] solution(int[] heights) {
        int[] answer = new int[heights.length];

        // 그냥 이렇게 단순히 answer에다가 바로 더해주면 될 걸 괜히 Map까지 만들어서 공간 복잡도를 올려버렸네!
        for (int i=0; i<heights.length; i++){
            for (int j=i+1; j<heights.length; j++){
                if (heights[i] > heights[j]){
                    // 현재 i의 다음 칸인 j부터 채워넣기 시작한다.
                    answer[j]=j;
                }
                // 어차피 배열은 0으로 초기화되니까 j보다 작으면 처리할 필요 없다.
            }
        }

        return answer;
    }
}
