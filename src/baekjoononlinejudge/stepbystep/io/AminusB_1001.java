package baekjoononlinejudge.stepbystep.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class AminusB_1001 {
	public static void main(String[] args) throws NumberFormatException, IOException {

		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);

		int A, B;
		String input = br.readLine();
		String[] s3 = input.split(" ");

		A = Integer.parseInt(s3[0]);
		B = Integer.parseInt(s3[1]);

		System.out.println(A - B);

	}
}
