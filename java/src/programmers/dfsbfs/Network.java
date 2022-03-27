package programmers.dfsbfs;

public class Network {
    static boolean[][] link;
    public static void main(String[] args) {
        int[][] computers = {{1,1,0}, {1,1,0}, {0,0,1}};
        System.out.println(new Network().solution(3, computers));
    }

    public int solution(int n, int[][] computers) {
        int answer = 0;
        link = new boolean[n][n];

        for(int i=0; i<n; i++){
            // link[i][i]는 무조건 1이어야 하는데 false라면 아직 처리하지 않은 값이므로
            if(!link[i][i]){
                dfs(computers, i, n);
                answer++;
            }
        }
        return answer;
    }

    public void dfs(int[][] computers, int i, int n){
        for(int j=0; j<n; j++){
            if(computers[i][j] == 1 && !link[i][j]){
                link[i][j] = link[j][i] = true;

                dfs(computers, j, n);
            }
        }
    }
}
