package usefulfunctions.sorting;

import java.util.*;

public class SortingWithTreeMap {
    public static void main(String[] args) {

        /* TreeMap을 이용한 이름 순 기본 정렬 */
        Actor[] arr = new Actor[] {
                new Actor("헤더 로클리어", 1961, "Heather Deen Locklear"),
                new Actor("데미 무어", 1962, "Demetria Gene Guynes"),
                new Actor("안젤라 바셋", 1958, "Angela Bassett"),
                new Actor("신디 크로퍼드", 1966, "Cintia Ann Crawford"),
                new Actor("캐서린 제타 존스", 1969, "Catherine Jones")
        };

        List<Actor> list = Arrays.asList(arr);
        Set<Actor> set = new TreeSet<Actor>(list);
        System.out.println(set);

        /* TreeMap을 이용해 Comparator 재정의 */
        Set<Actor> set2 = new TreeSet<Actor>(new Comparator<Actor>() {
            @Override
            public int compare(Actor o1, Actor o2) {
                int by1 = ((Actor) o1).birthYear;
                int by2 = ((Actor) o2).birthYear;
                return by1 > by2 ? -1 : (by1 == by2 ? 0 : 1);
            }
        });
        set2.addAll(list);
        System.out.println(set2);

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

        // TreeSet 사용 시에도 해당 데이터가 객체이므로 overriding이 필요하다.
        @Override
        public int compareTo(Object o) {
            // Actor 객체의 name을 비교해서 정렬하도록 구현
            return name.compareTo(((Actor) o).name);
        }
    }
}
