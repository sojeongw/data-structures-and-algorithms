package BaekjoonOnlineJudge.StepByStep.Alignment;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class AlignNumber2_2751 {
    private static List<Integer> targetList = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++){
            targetList.add(Integer.parseInt(br.readLine()));
        }
        br.close();

        sort(targetList);
        print(targetList);
    }

    private static List<Integer> sort(List<Integer> targetList){
        // 리스트에 값이 있다면
        if(targetList.size() > 1){
            // 왼쪽과 오른쪽으로 나눠서 sort하도록 보낸다.
            return merge(
                    sort(targetList.subList(0, targetList.size() / 2)),
                    sort(targetList.subList(targetList.size() / 2, targetList.size()))
                    );
        }
        else {
            // 리스트에 값이 없다면 재귀를 종료한다.
            return targetList;
        }
    }

    // 왼쪽, 오른쪽 각각 정렬 완료한 뒤 합치는 메소드
    private static List<Integer> merge(List<Integer> left, List<Integer> right){
        List<Integer> result = new ArrayList<>();
        int rightIdx = 0;

        // 왼쪽 배열을 순환하면서
        for(Integer l : left){
            // right를 끝까지 돌때까지 right에 있는 값이 왼쪽 배열에 있는 모든 값보다 작으면
            while(right.size() > rightIdx && l > right.get(rightIdx)) {
                // 그 작은 값을 결과에 넣는다.
                result.add(right.get(rightIdx));
                // 다음 오른쪽 값과 비교하기 위해 준비한다.
                rightIdx++;
            }
            // 그렇지 않다면 왼쪽 값이 작으므로 왼쪽값을 넣는다.
            result.add(l);
        }
        // 다 정리가 됐으니 오른쪽에 남은 배열을 결과에 넣는다.
        for(int i=rightIdx; i<right.size(); i++){
            result.add(right.get(i));
        }
        return result;
    }

    private static void print(List<Integer> targetList) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        targetList.forEach(r -> {
            try {
                bw.write(String.valueOf(r));
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        bw.close();
    }
}
