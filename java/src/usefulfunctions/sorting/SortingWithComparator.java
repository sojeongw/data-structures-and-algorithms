package usefulfunctions.sorting;

import java.util.Arrays;
import java.util.Comparator;

public class SortingWithComparator {
    public static void main(String[] args) {

        /* 기본 정렬 외의 다른 기준을 세우고 싶다면 Comparator를 구현한다. -> 주로 익명클래스를 활용함. */
        Actor[] arr = new Actor[] {
                new Actor("박보검", 1993),
                new Actor("유승호", 1991),
                new Actor("차은우", 1996),
                new Actor("서강준", 1994)
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

        // Constructor
        public Actor(String name, int birthYear) {
            this.name = name;
            this.birthYear = birthYear;
        }

        public String toString() {
            return name + " " + birthYear + "년생";
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
