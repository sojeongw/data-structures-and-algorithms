package UsefulFunctions.Sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SortingWithArrays {
    public static void main(String[] args) {

        /* array 정렬 */
        String[] s = {"b", "A", "D", "C", "a", "F"};

        /* 대소문자 구분한 정렬 */
        Arrays.sort(s);     // String 클래스가 Comparable 인터페이스를 구현하고 compareTo 메서드가 알파벳 순서로 정렬하도록 구현되어있기 때문에 sorting 된다.
        System.out.println(s);  // 배열이라 주소값이 출력되므로 toString() 필요
        System.out.println(Arrays.toString(s));     // [A, C, D, F, a, b]

        /* 역순으로 정렬 */
        for(int i=0; i<s.length/2; i++){
            String tmp = s[i];
            s[i] = s[(s.length - 1) - i];
            s[(s.length - 1) - i] = tmp;
        }
        System.out.println(Arrays.toString(s));     // [b, a, F, D, C, A]

        /* 대소문자 구분 없이 정렬 */
        Arrays.sort(s, String.CASE_INSENSITIVE_ORDER);
        System.out.println(Arrays.toString(s));     // [a, A, b, C, D, F]

    }
}
