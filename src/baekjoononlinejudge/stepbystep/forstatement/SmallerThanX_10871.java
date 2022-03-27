package baekjoononlinejudge.stepbystep.forstatement;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class SmallerThanX_10871 {
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());

		// 정수 N개를 입력 받는다
		int N = Integer.parseInt(st.nextToken());

		// 기준 X를 입력 받는다
		int X = Integer.parseInt(st.nextToken());

		// N 크기 만큼의 배열을 만든다
		String[] arr = new String[N];

		// 숫자를 입력 받는다
		StringTokenizer st2 = new StringTokenizer(br.readLine());

		for (int i = 0; i < arr.length; i++) {
			// 원소를 쪼개서 배열에 넣는다
			arr[i] = st2.nextToken();
		}

		// X보다 작은지 체크한다
		for (int i = 0; i < arr.length; i++) {
			if (Integer.valueOf(arr[i]) < X) {
				// 작은 수를 출력한다
				System.out.print(arr[i] + " ");
			}
		}

		bw.flush();
		br.close();
		bw.close();

	}
}
