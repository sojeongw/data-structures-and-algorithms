package UsefulFunctions.Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingWithCollections {
    public static void main(String[] args) {

        /* List Collection(ArrayList, LinkedList, Vector) 정렬 방법 */
        List<String> list = new ArrayList<>();
        list.add("z");
        list.add("a");
        list.add("A");
        list.add("c");

        System.out.println("기본 정렬: " + list);   // [z, a, A, c]

        /* 대소문자 구분 없이 알파벳 순 정렬 */
        Collections.sort(list, String.CASE_INSENSITIVE_ORDER);
        System.out.println("알파벳 순 정렬: " + list);    // [a, A, c, z]

        /* 대소문자 구분해서 역순으로 정렬 */
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("역순으로 정렬: " + list);     // [z, c, a, A]
    }
}
