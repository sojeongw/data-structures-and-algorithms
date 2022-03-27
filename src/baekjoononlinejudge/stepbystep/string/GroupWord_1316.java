package baekjoononlinejudge.stepbystep.string;

import java.io.*;

public class GroupWord_1316 {
    public static void main(String[] args) throws IOException {
        // sysout으로 하면 112ms, bw로 하면 76ms
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int result = n;     // 일단 모든 단어가 그룹 단어에 해당된다고 가정한다.

        for(int i=0; i<n; i++){
            String input = br.readLine();
            // 그룹 단어인지 체크하고, 그룹 단어가 아닌만큼 뺀다.
            result = result - wordCheck(input);
        }
        bw.write(result+"");
        bw.close();
    }

    static int wordCheck(String word){
        char temp;
        int isGroupWord = 0;      // 그룹 단어면 0, 아니면 1

        char[] input = word.toCharArray();
        temp = input[0];

        // 2중 for문을 나오기 위함
        outerLoop:
        for(int i=1; i<input.length; i++){
            if(temp != input[i]){   // 알파벳이 이어지지 않는다면
                for(int k=i+1; k<input.length; k++){ // 그 뒤에 또 temp가 나오는지 체크한다.
                    if(temp == input[k]){   // 같은 알파벳이 또 나온다면
                        isGroupWord++;    // 그룹 단어가 아니므로 1로 변경한다.
                        break outerLoop;    // 더 이상 확인할 이유가 없으므로 2중 for문을 빠져나간다.
                    }
                }
                // 지금까지 그룹 단어가 맞다면 다음 알파벳으로 넘어간다.
                temp = input[i];
            }
        }
        return isGroupWord;
    }
}