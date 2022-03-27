package baekjoononlinejudge.stepbystep.mathmatics;

import java.io.*;

public class Honeycomb_2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int input = Integer.parseInt(br.readLine());
        bw.write(String.valueOf(solution(input)));
        bw.close();
    }

    private static int solution(int input){
        /*
        * 1번 방: 1
        * 2~7번 방(총 6개): 2
        * 8~19번 방(총 12개): 3
        * 20~37번 방(총 18개): 4
        * 38~61번 방(총 24개): 5
        * ...
        * 한 라인에만 속하면 언제나 지나는 방의 개수는 같다.
        * n>1일 때, a(n) = a(n-1) + 6*(n-1) 이다.
        * */

        if(input == 1) return 1;

        int i = 2;     // 각 줄의 첫번째 방을 구하기 위함
        int k = 1;     // 6의 배수로 곱할 값

        while(i <= input){
            i += 6 * k++;
        }

        return k;
    }
}
