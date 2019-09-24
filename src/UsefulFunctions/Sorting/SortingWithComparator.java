package UsefulFunctions.Sorting;

import java.util.Arrays;
import java.util.Comparator;

public class SortingWithComparator {
    public static void main(String[] args) {

        /* 기본 정렬 외의 다른 기준을 세우고 싶다면 Comparator를 구현한다. -> 주로 익명클래스를 활용함. */
        Actor[] arr = new Actor[] {
                new Actor("헤더 로클리어", 1961, "Heather Deen Locklear"),
                new Actor("데미 무어", 1962, "Demetria Gene Guynes"),
                new Actor("안젤라 바셋", 1958, "Angela Bassett"),
                new Actor("신디 크로퍼드", 1966, "Cintia Ann Crawford"),
                new Actor("캐서린 제타 존스", 1969, "Catherine Jones")
        };

        Arrays.sort(arr, new Comparator<Actor>(){
            @Override
            public int compare(Actor o1, Actor o2) {
                int by1 = ((Actor) o1).birthYear;
                int by2 = ((Actor) o2).birthYear;
                return by1 > by2 ? -1 : (by1 == by2 ? 0 : 1);
            }
        });
        for(Actor result:arr){
            System.out.println(result);
        }
    }
    static class Actor{
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
    }

    /* Comparator를 따로 빼서 선언하는 방법
    class YoungOrderComparator implements Comparator<Object> {
    public int compare(Object o1, Object o2) {
        int by1 = ((Actor) o1).birthYear;
        int by2 = ((Actor) o2).birthYear;
        return by1 > by2 ? -1 : (by1 == by2 ? 0 : 1);
         }
    }*/
}
