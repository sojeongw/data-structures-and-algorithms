package programmers.array;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        String[] input = new String[]{"봄", "여울", "봄봄", "여"};
        int[] input1 = new int[]{1,2,3,2};
        int[] input2 = new int[]{1,3};

//        soltution(input);
        solution2(input1, input2);
    }


    public static void solution2(int[] arrayA, int[] arrayB) {
        List<Integer> answer = new ArrayList<>();
        List<Integer> resultA = new ArrayList<>();
        List<Integer> resultB = new ArrayList<>();

        // a 중복제거
        for (int value : arrayA) {
            if (!resultA.contains(value)) {
                resultA.add(value);
            }
        }
        // b 중복 제거
        for (int value : arrayB) {
            if (!resultB.contains(value)) {
                resultB.add(value);
            }
        }

        answer.add(resultA.size());
        answer.add(resultB.size());
        answer.add(sum(resultA, resultB));
        answer.add(complement(resultA, resultB));
        answer.add(intersect(resultA, resultB));

        answer.toArray();
        System.out.println(answer);
    }

    private static int sum(List<Integer> resultA, List<Integer> resultB) {
        List<Integer> resultList = new ArrayList<>();
        resultList.addAll(resultA);

        for(int value : resultB) {
            if (!resultA.contains(value)) {
                resultList.add(value);
            }
        }

        return resultList.size();
    }

    private static int complement(List<Integer> resultA, List<Integer> resultB) {
        List<Integer> resultList = new ArrayList<>();

        for(int value : resultA) {
            if(!resultB.contains(value)){
                resultList.add(value);
            }
        }

        return resultList.size();
    }

    private static int intersect(List<Integer> resultA, List<Integer> resultB) {
        List<Integer> resultList = new ArrayList<>();

        for(int value : resultA) {
            if(resultB.contains(value)){
                resultList.add(value);
            }
        }

        return resultList.size();
    }






    public static void soltution(String[] name_list){
        boolean answer = false;

        List<String> nameList = new ArrayList<>();
        for(int i=0; i<name_list.length-1; i++) {

            for(int j=i+1; j<name_list.length; j++) {
                if (name_list[i].contains(name_list[j]) || name_list[j].contains(name_list[i])) {
                    answer = true;
                    System.out.println(name_list[i] + " " + name_list[j]);
                    break;
                }
            }
        }

        System.out.println(answer);
    }
}
