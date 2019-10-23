package CodeUp.Basic100.Arrays;

import java.util.Scanner;

public class N1099 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] box = new int[10][10];

        for (int i = 0; i < box.length; i++) {
            for (int j = 0; j < box[i].length; j++) {
                box[i][j] = sc.nextInt();
                if(i==1 && j==1){
                    box[i][j] = 9;
                }
            }
        }

        int j = 1;
        boolean flag = false;

        for (int i = 1; i < box.length-1 && !flag; i++) {
            for (j = j; j < box[i].length-1; j++) {
                if(box[i][j]==2){
                    box[i][j] = 9;
                    flag = true;
                    break;
                }else if(box[i][j+1]==1){
                box[i][j] = 9;
                    break;
                }
                box[i][j] = 9;

            }
        }

        for (int i = 0; i < box.length; i++) {
            for (int k = 0; k < box[i].length; k++) {
                System.out.print(box[i][k] + " ");
            }
            System.out.println();
        }
    }
}
