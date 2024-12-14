import java.util.Scanner;

public class Main {
	static final int MOD = 1000000000;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		long[][] D = new long[N + 1][10];

		// 초기 조건: 1자리 계단 수
		for (int j = 1; j <= 9; j++) {
			D[1][j] = 1;
		}

		// 점화식으로 DP 배열 채우기
		for (int i = 2; i <= N; i++) {
			for (int j = 0; j <= 9; j++) {
				if (j == 0) {
					D[i][j] = D[i - 1][1]; // 0은 이전 자리의 1에서만 올 수 있음
				} else if (j == 9) {
					D[i][j] = D[i - 1][8]; // 9는 이전 자리의 8에서만 올 수 있음
				} else {
					D[i][j] = (D[i - 1][j - 1] + D[i - 1][j + 1]) % MOD; // 그 외
				}
			}
		}

		// 결과 계산
		long result = 0;
		for (int j = 0; j <= 9; j++) {
			result = (result + D[N][j]) % MOD;
		}

		System.out.println(result);
	}
}
