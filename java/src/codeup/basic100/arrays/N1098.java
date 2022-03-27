package codeup.basic100.arrays;

import java.util.Scanner;

public class N1098 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int n = sc.nextInt();
        int[][] result = new int[h][w];

        for (int i = 0; i < n; i++) {
            int l = sc.nextInt();
            int d = sc.nextInt();
            int y = sc.nextInt();
            int x = sc.nextInt();

            for (int j = 0; j < l; j++) {
                if (d == 0) {
                    result[y - 1][x - 1 + j] = 1;
                } else {
                    result[y - 1 + j][x - 1] = 1;
                }
            }

        }

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
