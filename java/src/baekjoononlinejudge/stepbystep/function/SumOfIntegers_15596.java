package baekjoononlinejudge.stepbystep.function;

import java.util.Scanner;

public class SumOfIntegers_15596 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }

        Test t = new Test();
        t.sum(a);
    }
}
class Test{
    public long sum(int[] a){
        long sum = 0;
        for(int i=0; i<a.length; i++){
            sum += a[i];
        }
        return sum;
    }
}