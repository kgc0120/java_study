package bfs;

/*
* https://programmers.co.kr/learn/courses/30/lessons/43162
* 네트워크
* dfs 함수경우 대각선 값은 신경안씀
* dfsOther 함수는 대각선 값도 신경씀
* 이번 문제에는 대각선 값을 신경쓴느 dfsOhter 함수가 맞다.
* */
public class Network {

    // 상하좌우
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {-1, 1, 0, 0};
//    private static int count;

    public static void main(String[] args) {

        int n = 3;
        int[][] computers = {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};
        int[][] param1 = 	{{1, 1, 0}, {1, 1, 1}, {0, 1, 1}};
        int[][] param2 = 	{{1, 0, 1}, {0, 1, 0}, {0, 0, 1}};


        System.out.println(solutionOther(n, param2));
    }


    public static int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[][] check  = new boolean[n][n];

        for (int i = 0; i < computers.length; i++) {
            for (int j = 0; j < computers[i].length; j++) {
                if(computers[i][j] != 0 && !check[i][j]) {
                    answer++;
                    dfs(i, j, computers, check);
                }
            }
        }

        return answer;
    }
    public static void dfs(int x, int y, int[][] computers, boolean[][] check) {

        if(check[x][y]) {
            return;
        }

        check[x][y] = true;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx < 0 || nx >= computers.length || ny < 0 ||  ny >= computers[0].length) {
                continue;
            }

            if(computers[x][y] == computers[nx][ny] && !check[nx][ny]) {
                dfs(nx, ny, computers, check);
            }

        }
    }

    public static int solutionOther(int n, int[][] computers) {
        int count =0;
        boolean[] visit = new boolean[n];
        // 전체 컴퓨터 방문
        for (int i = 0; i < n; i++) {
            // 이미 방문 도장이 찍혀있으면 가지 않음
            if (!visit[i]) {
                // 첫 노드부터 재귀함수 시작
                dfsOther(n, i, computers, visit);
                count++;
            }
        }
        return count;
    }



    private static void dfsOther(int n, int index, int[][] computers, boolean[] visit) {
        // 방문확인
        visit[index] = true;
        // 노드 방문
        for (int i = 0; i < n; i++) {
            // 연결된 노드, 자신 제외, 아직 방문기록이 없는 노드
            if (computers[index][i] == 1 && i != index && !visit[i]) {
                dfsOther(n, i, computers, visit);
            }
        }
    }
}
