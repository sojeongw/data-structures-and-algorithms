package Programmers.DFS_BFS;

public class TargetNumber {
    static int ANSWER = 0;
    public static void main(String[] args) {
        int[] numbers = {1,1,1,1,1};
        int target = 3;
        System.out.println(new TargetNumber().solution(numbers, target));
    }
    public int solution(int[] numbers, int target) {
        dfs(numbers, target, 0);
        return ANSWER;
    }

    private void dfs(int[] numbers, int target, int k) {
        if(k == numbers.length){
            int sum = 0;
            for(int i=0; i<numbers.length; i++){
                sum += numbers[i];
            }
            if(sum == target) {
                ANSWER++;
            }
        }else{
            numbers[k] *= 1;
            dfs(numbers, target, k+1);

            numbers[k] *= -1;
            dfs(numbers, target, k+1);
        }

    }

}
