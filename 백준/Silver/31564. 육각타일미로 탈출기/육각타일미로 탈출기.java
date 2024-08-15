import java.util.*; // Scanner, Queue, LinkedList 등의 유틸리티 클래스를 사용하기 위한 임포트

public class Main {
    // 홀수 행에서의 이동 방향을 나타내는 배열
    // 예를 들어, 현재 위치가 (x, y)일 때, (x-1, y)는 위쪽, (x+1, y)는 아래쪽 방향입니다.
    private static final int[][] directionsOdd = {
        {-1, 0}, // 위쪽 (상)
        {1, 0},  // 아래쪽 (하)
        {0, -1}, // 왼쪽 (좌)
        {0, 1},  // 오른쪽 (우)
        {-1, 1}, // 위쪽 대각선 오른쪽 (상우)
        {1, 1}   // 아래쪽 대각선 오른쪽 (하우)
    };

    // 짝수 행에서의 이동 방향을 나타내는 배열
    // 짝수 행에서는 대각선 방향이 홀수 행과 다르게 동작합니다.
    private static final int[][] directionsEven = {
        {-1, 0}, // 위쪽 (상)
        {1, 0},  // 아래쪽 (하)
        {0, -1}, // 왼쪽 (좌)
        {0, 1},  // 오른쪽 (우)
        {-1, -1}, // 위쪽 대각선 왼쪽 (상좌)
        {1, -1}  // 아래쪽 대각선 왼쪽 (하좌)
    };

    // BFS(너비 우선 탐색)를 통해 출발점에서 도착점까지의 최단 경로를 찾는 함수
    private static int bfs(int startX, int startY, int endX, int endY, boolean[][] grid, int n, int m) {
        Queue<int[]> queue = new LinkedList<>(); // BFS 탐색을 위한 큐 (탐색할 위치들을 저장)
        boolean[][] visited = new boolean[n][m]; // 각 위치의 방문 여부를 기록하는 배열
        int[][] distance = new int[n][m]; // 출발점에서 각 위치까지의 최단 거리를 저장하는 배열

        queue.offer(new int[]{startX, startY}); // 출발점을 큐에 추가
        visited[startX][startY] = true; // 출발점을 방문한 것으로 표시
        distance[startX][startY] = 0; // 출발점까지의 거리는 0

        // 큐가 비어있지 않을 때까지 반복
        while (!queue.isEmpty()) {
            int[] current = queue.poll(); // 큐에서 현재 위치를 꺼냄
            int x = current[0]; // 현재 위치의 x 좌표
            int y = current[1]; // 현재 위치의 y 좌표

            // 현재 위치가 도착점인지 확인
            if (x == endX && y == endY) {
                return distance[x][y]; // 도착점에 도달했으므로 현재까지의 거리 반환
            }

            // 현재 행이 짝수인지 홀수인지에 따라 이동 가능한 방향 배열 선택
            int[][] directions = (x % 2 == 0) ? directionsEven : directionsOdd;

            // 6가지 가능한 방향으로 이동
            for (int[] direction : directions) {
                int nx = x + direction[0]; // 다음 위치의 x 좌표 계산
                int ny = y + direction[1]; // 다음 위치의 y 좌표 계산

                // 다음 위치가 미로 범위 내에 있고, 장애물이 아니며, 방문하지 않은 경우에만 이동
                if (nx >= 0 && nx < n && ny >= 0 && ny < m && !visited[nx][ny] && !grid[nx][ny]) {
                    visited[nx][ny] = true; // 다음 위치를 방문한 것으로 표시
                    distance[nx][ny] = distance[x][y] + 1; // 다음 위치까지의 거리 계산
                    queue.offer(new int[]{nx, ny}); // 다음 위치를 큐에 추가하여 탐색을 계속함
                }
            }
        }
        return -1; // 큐가 비었는데도 도착점에 도달하지 못한 경우 -1을 반환 (도달 불가능)
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 입력을 읽기 위한 스캐너 객체 생성

        int n = scanner.nextInt(); // 미로의 행 개수를 입력받음
        int m = scanner.nextInt(); // 미로의 열 개수를 입력받음
        int k = scanner.nextInt(); // 장애물의 개수를 입력받음
        scanner.nextLine(); // 줄바꿈 문자를 처리하기 위한 명령

        boolean[][] grid = new boolean[n][m]; // 미로를 나타내는 2D 배열 생성 (true면 장애물, false면 빈 타일)

        // 장애물 위치 입력 및 처리
        for (int i = 0; i < k; i++) {
            int x = scanner.nextInt(); // 장애물의 행 위치를 입력받음
            int y = scanner.nextInt(); // 장애물의 열 위치를 입력받음
            scanner.nextLine(); // 줄바꿈 문자를 처리하기 위한 명령
            grid[x][y] = true; // 해당 위치를 장애물로 표시
        }

        // BFS를 통해 출발점에서 도착점까지의 최단 경로를 계산
        int result = bfs(0, 0, n-1, m-1, grid, n, m); // 출발점 (0, 0)에서 도착점 (n-1, m-1)까지의 거리 계산
        System.out.println(result); // 결과 출력 (최단 경로의 타일 개수 또는 -1)

        scanner.close(); // 스캐너 객체를 닫아 리소스를 해제
    }
}
