package programmers.array;

import java.util.Arrays;

public class BiggestNumber {
    public static void main(String[] args) {
        int[] numbers = {6, 10, 2};

        System.out.println(new BiggestNumber().solution(numbers));
    }

    public String solution(int[] numbers) {
        String answer = "";
        String[] tmpArr = new String[numbers.length];

        for(int i=0; i<tmpArr.length; i++){
            // int를 String으로 변환
            tmpArr[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(tmpArr, (o1, o2) -> (o2+o1).compareTo(o1+o2));
        /*
        위의 람다식은 아래와 같다.
        Arrays.sort(tmpArr, new Comparator<String>(){
            @Override
            public int compare(String o1, String o2) {
                return (o2+o1).compareTo(o1+o2);
            }
        });
        */

        // 가장 큰 순으로 정렬했는데 0으로 시작한다면 0을 넣어주고 끝낸다.
        if(tmpArr[0].startsWith("0")){
            answer += "0";
        }else{
            for(int j=0; j<tmpArr.length; j++){
                answer += tmpArr[j];
            }
        }

        return answer;
    }
}
