package bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ComplexNumberingTest {
    private static int[] dx = {0, 0, 1, -1};
    private static int[] dy = {1, -1, 0, 0};
    private static int[][] map = new int[25][25];
    private static boolean[][] visited = new boolean[25][25];
    private static int complexNum = 0; // 단지
    private static int[] complex = {25 * 25};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        map = new int[n][n];
        visited = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            String input = scanner.next();
            for (int j = 0; j < n; j++) {
                map[i][j] = input.charAt(j) - '0';
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(map[i][j] == 1 && !visited[i][j]) {
                    complexNum++;
                    bfs(i, j);

                }

            }

        }

    }

    private static void bfs(int i, int j) {

        Queue<int[]> queue = new LinkedList();
        queue.add(new int[]{i, j});
        visited[i][j] = true;
        complex[complexNum]++;


    }


}
