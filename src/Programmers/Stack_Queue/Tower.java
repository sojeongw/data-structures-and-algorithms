package Programmers.Stack_Queue;

import java.util.*;

public class Tower {
    public static void main(String[] args) {
        int[] heights = {3,9,9,3,5,7,2};

        System.out.println(Arrays.toString(new Tower().solution(heights)));
    }
    public int[] solution(int[] heights) {
        int[] answer = new int[heights.length];
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=heights.length-1; i>0; i--){
            for(int j=i-1; j>=0; j--){
                if(heights[i] < heights[j]){
                    map.put(i, j+1);
                    break;
                }else{
                    if(j==0) map.put(i, 0);
                }
            }
        }
        map.put(0,0);

        for(int i=0; i<map.size(); i++){
            answer[i] = (int)map.get(i);
        }

        return answer;
    }
}
