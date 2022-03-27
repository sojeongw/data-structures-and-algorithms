package programmers.stackqueue;///*
//package Programmers.StackQueue;
//import java.io.*;
//import java.util.*;
//
//class Main {
//    private final String WHITE_SPACE = " ";
//    private StringBuilder result;
//
//    private List<String> dataList;
//    private Map<String, Long> cacheMap;
//
//    public static void main(String[] args) {
//        Main main = new Main();
//        main.set();
//        main.run();
//    }
//
//    private void set() {
//        dataList = new LinkedList<>();
//        cacheMap = new HashMap<>();
//        result = new StringBuilder();
//    }
//
//    private void run() {
//        Scanner sc = new Scanner(System.in);
//        int n = Integer.parseInt(sc.nextLine());
//
//        for (int i = 0; i < n; i++) {
//            String input = sc.nextLine();
//            String[] arr = input.split(WHITE_SPACE);
//            if (arr[0].equals("enqueue")) {
//                enqueue(arr[1]);
//            }else if(arr[0].equals("dequeue")) {
//                dequeue();
//            }
//        }
//
//        System.out.println(result.toString());
//    }
//
//    private void enqueue(String data) {
//        dataList.add(data);
//        if (cacheMap.containsKey(data)) {
//            cacheMap.put(data, cacheMap.get(data) + 1);
//        } else {
//            cacheMap.put(data, 1L);
//        }
//    }
//
//    private void dequeue() {
//        String maxKey = dataList.get(0);
//        long maxVal = cacheMap.get(maxKey);
//
//        if (cacheMap.size() == 0){
//            return;
//        }
//
//        for (String k : cacheMap.keySet()) {
//            if (maxVal < cacheMap.get(k)) {
//                maxKey = k;
//                maxVal = cacheMap.get(k);
//            } else if (maxVal <= cacheMap.get(k) && dataList.indexOf(k) < dataList.indexOf(maxKey)) {
//                maxKey = k;
//                maxVal = cacheMap.get(k);
//            }
//        }
//
//        cacheMap.put(maxKey, cacheMap.get(maxKey) - 1);
//
//        result.append(dataList.get(dataList.indexOf(maxKey))).append(" ");
//        dataList.remove(maxKey);
//    }
//
//}
//*/
