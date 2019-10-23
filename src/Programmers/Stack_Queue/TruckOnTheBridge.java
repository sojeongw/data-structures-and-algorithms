package Programmers.Stack_Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class TruckOnTheBridge {
    public static void main(String[] args) {
        int bridge_length = 2;
        int weight = 10;
        int[] truck_weights = {7, 4, 5, 6};

        System.out.println(new TruckOnTheBridge().solution(bridge_length, weight, truck_weights));
    }

    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;

        // 다리에 올라가려고 대기하는 트럭
        Deque<Truck> t_wait = new ArrayDeque<>();
        // 다리 위에 올라온 트럭
        Deque<Truck> t_bridge = new ArrayDeque<>();

        // 대기열에 트럭 추가
        for (int t_weight : truck_weights) {
            t_wait.add(new Truck(t_weight, bridge_length));
        }

        // 대기 중인 트럭이 다리를 지나서 대기 줄과 다리가 다 빌 때까지 반복
        while (!(t_wait.isEmpty() && t_bridge.isEmpty())) {
            // 처음 1초가 지남
             answer++;

             // 다리를 통과했을 때: 트럭이 다리 위에 있으면서 남은 길이가 0일 때
            if(!t_bridge.isEmpty() && (t_bridge.peek().distance == 0)){
                // 차지하고 있던 무게를 반환
                weight += t_bridge.peek().weight;
                // 지나간 트럭을 다리에서 제거
                t_bridge.poll();
            }

            // 대기 중인 트럭이 있고, 그 트럭이 다리에 올라갈 만큼 하중이 남았을 때
            if(!t_wait.isEmpty() && (weight - t_wait.peek().weight >= 0)){
                // 대기 줄 첫번째에 있는 트럭의 무게를 하중에서 차감
                weight -= t_wait.peek().weight;
                // 대기 중인 트럭을 빼서 다리 위로 추가
                t_bridge.add(t_wait.poll());
            }

            // 다리 위에 있는 트럭의 남은 거리를 1씩 차감
            for(Truck t : t_bridge){
                t.distance--;
            }

        }


        return answer;
    }

    class Truck {
        int weight;
        int distance;

        public Truck(int weight, int distance) {
            this.weight = weight;
            this.distance = distance;
        }
    }
}
