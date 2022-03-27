package usefulfunctions.sorting;

import java.util.Arrays;

public class SortingWithComparable {
    public static void main(String[] args) {

        /* Arrays.sort()에서 스트링이 아니라 객체를 정렬하고 싶다면 Comparable을 overriding 한다. */
        Actor[] arr = new Actor[] {
                new Actor("박보검", 1993),
                new Actor("유승호", 1991),
                new Actor("차은우", 1996),
                new Actor("서강준", 1994)
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

        // Constructor
        public Actor(String name, int birthYear) {
            this.name = name;
            this.birthYear = birthYear;
        }

        public String toString() {
            return name + " " + birthYear + "년생";
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

