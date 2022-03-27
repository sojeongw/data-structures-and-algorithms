package programmers.stackqueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Integer> map = new HashMap<>();
        List<String> bugList = new ArrayList<>();

        int  cardNum = Integer.parseInt(br.readLine());
        String s= br.readLine();
        String[] arr = s.split(" ");

        int count = cardNum;

        for(String a:arr){
            int n = 1;
            if(map.keySet().contains(a)){
                n++;
            }
            map.put(a, n);
        }

        for(int i=0; i<cardNum; i++){
            if(map.keySet().contains(arr[i])){

            }
            count --;
        }

//        for(Bug arg: bugList){
//            System.out.println("list: " + arg.name +" "+arg.count);
//
//        }

        br.close();
    }
}
class Bug{
    String name;
    int count;

    public Bug(String name, int count) {
        this.name = name;
        this.count = count;
    }
}