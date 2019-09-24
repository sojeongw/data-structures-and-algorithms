package UsefulFunctions.Sorting;

import java.util.Arrays;
import java.util.Comparator;

public class SortingWithComparable {
    public static void main(String[] args) {

        /* Arrays.sort()에서 스트링이 아니라 객체를 정렬하고 싶다면 Comparable을 overriding 한다. */
        Actor[] arr = new Actor[] {
                new Actor("헤더 로클리어", 1961, "Heather Deen Locklear"),
                new Actor("데미 무어", 1962, "Demetria Gene Guynes"),
                new Actor("안젤라 바셋", 1958, "Angela Bassett"),
                new Actor("신디 크로퍼드", 1966, "Cintia Ann Crawford"),
                new Actor("캐서린 제타 존스", 1969, "Catherine Jones")
        };

        /* 기본 정렬: Actor 클래스에 overriding 한 Actor.name 순 */
        Arrays.sort(arr);
        for(Actor result:arr){
            System.out.println(result);
        }
    }

    static class Actor implements Comparable<Object>{
        String name;
        int birthYear;
        String engName;

        // Constructor
        public Actor(String name, int birthYear, String engName) {
            this.name = name;
            this.birthYear = birthYear;
            this.engName = engName;
        }

        public String toString() {
            return name + "(" + engName + ") " + birthYear + "년생";
        }

        // Comparable 인터페이스의 compareTo를 overriding
        // Comparable은 Integer, Double은 오름차순, String은 사전 순으로 정렬한다.
        @Override
        public int compareTo(Object o) {
            // Actor 객체의 name을 비교해서 정렬하도록 구현
            return name.compareTo(((Actor) o).name);
        }
    }
}

