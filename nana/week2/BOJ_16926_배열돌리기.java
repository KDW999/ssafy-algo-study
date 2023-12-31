package acmicpc.algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_16926 {

	private static int[][] dir = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int R = Integer.parseInt(st.nextToken());

		// 배열 입력 받기
		int[][] num = new int[N][M];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				num[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		int group = Math.min(N, M) / 2;

		for (int r = 0; r < R; r++) {
			// 회전 시키기

			for (int i = 0; i < group; i++) {
				int x = i;
				int y = i;
				int temp = num[x][y];

				for (int[] d : dir) {
					while (true) {
						int nx = x + d[0];
						int ny = y + d[1];

						if (nx < i || ny < i || nx >= N - i || ny >= M - i) {
							break;
						}

						num[x][y] = num[nx][ny];
						x = nx;
						y = ny;
					}
				}

				num[i + 1][i] = temp;
			}
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				System.out.print(num[i][j] + " ");
			}
			System.out.println();
		}

	}

}
