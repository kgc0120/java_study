package bfs;



// baekjoon
// 2667, 단지 번호 붙이기


import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ComplexNumbering {
    private static int dx[] = {0, 0, 1, -1};
    private static int dy[] = {1, -1, 0, 0};
    private static int[] aparts = new int[25 * 25];
    private static int n;
    private static int apartNum = 0;
    private static boolean[][] visited = new boolean[25][25];
    private static int[][] map = new int[25][25];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        map = new int[n][n];
        visited = new boolean[n][n];

        // 지도 입력
        for (int i = 0; i < n; i++) {
            String input = scanner.next();
            for (int j = 0; j < n; j++) {
                map[i][j] = input.charAt(j)-'0';
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j] == 1 && !visited[i][j]) {
                    apartNum++;
                    bfs(i, j);
                }
            }

        }

        Arrays.sort(aparts);
        System.out.println(apartNum);

        for (int i = 0; i < aparts.length; i++) {
            if(aparts[i] == 0) {
            } else {
                System.out.println(aparts[i]);
            }
        }
    }

    private static void bfs(int i, int j) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{i,j});
        visited[i][j] = true;
        aparts[apartNum]++;

        while (!queue.isEmpty()) {
            int curX = queue.peek()[0];
            int curY = queue.peek()[1];
            queue.poll();

            for (int k = 0; k < 4; k++) {
                int nx = curX + dx[k];
                int ny = curY + dy[k];

                if (nx >= 0 && ny >= 0 && nx < n && ny < n) {
                    if (map[nx][ny] == 1 && !visited[nx][ny]) {
                        queue.add(new int[]{nx,ny});
                        visited[nx][ny] = true;
                        aparts[apartNum]++;
                    }
                }

            }
        }
    }
}
