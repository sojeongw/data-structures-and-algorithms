package _BaekjoonOnlineJudge._StepByStep._ForStatement;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class PrintAsterisk_2439 {
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());

		// n-i만큼 공백을 만든다

		// i만큼 별을 찍는다

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				bw.write(" ");
			}
			for (int j = 1; j <= i; j++) {
				bw.write("*");
			}
			bw.write("\n");
		}

		bw.flush();
		br.close();
		bw.close();

	}
}
