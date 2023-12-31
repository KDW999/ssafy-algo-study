package acmicpc.algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_1946 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= T; tc++) {
			int N = Integer.parseInt(br.readLine());
			int[][] score = new int[N][2];

			for (int i = 0; i < N; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				score[i][0] = Integer.parseInt(st.nextToken());
				score[i][1] = Integer.parseInt(st.nextToken());
			}

			int count = 1;
			Arrays.sort(score, (a, b) -> a[0] - b[0]);
			int first = score[0][1];
			for (int i = 1; i < N; i++) {
				if (score[i][1] < first) {
					count++;
					first = score[i][1];
				}
			}

			// int count = N;

			// for (int i = 0; i < N; i++) {
			// for (int j = 0; j < N; j++) {
			// if (i != j && score[i][0] > score[j][0] && score[i][1] > score[j][1]) {
			// count--;
			// break;
			// }
			// }
			// }

			System.out.println(count);

		}

	}

}
