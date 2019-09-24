package BaekjoonOnlineJudge.StepByStep.ForStatement;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class PrintAsterisk_2438 {
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());

		for (int i = 1; i <= n; i++) {
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
