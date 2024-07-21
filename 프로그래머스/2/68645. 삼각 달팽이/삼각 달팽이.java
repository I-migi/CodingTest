class Solution {
    public int[] solution(int n) {
        // n x n 크기의 2차원 배열 초기화
        int[][] arr = new int[n][n];
        int x = 0, y = -1, num = 1;

        // 달팽이 모양으로 배열을 채우는 과정
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                switch (i % 3) {
                    case 0: // 오른쪽으로 이동
                        y++;
                        break;
                    case 1: // 아래로 이동
                        x++;
                        break;
                    case 2: // 왼쪽 위로 이동
                        x--;
                        y--;
                        break;
                }
                arr[x][y] = num++;
            }
        }

        // 2차원 배열을 1차원 배열로 변환
        int[] answer = new int[num - 1];
        int idx = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[j][i] == 0) {
                    break;
                }
                answer[idx++] = arr[j][i];
            }
        }
        return answer;
    }
}
