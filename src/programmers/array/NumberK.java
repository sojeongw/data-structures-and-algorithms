package programmers.array;

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
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = {};



        return answer;
    }
}
