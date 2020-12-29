package bfs;

import java.io.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ComplexNumberingTest {
    static int stoi(String s) { return Integer.parseInt(s);}
    private static int n;
    private static int[][] map;
    private static boolean[][] visited;
    private static int complexNum = 0;
    private static int[] dx = {0, 0, 1, -1 };
    private static int[] dy = {1, -1, 0, 0};
    private static int[] aparts;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        n = stoi(br.readLine());
        map = new int[n][n];
        visited = new boolean[n][n];

        for (int i=0; i<n; n++) {
            String input = br.readLine();
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

        bw.write(complexNum);
        Arrays.sort(aparts);
        for (int apart : aparts) {
            bw.write(apart);
        }
        bw.flush();


    }

    private static void bfs(int x, int y) {
        visited[x][y] = true;
        aparts[complexNum]++;

        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y});

        while (!queue.isEmpty()) {
            int curX = queue.peek()[0];
            int curY = queue.peek()[1];
            queue.poll();

            for(int i=0; i<4; i++) {
                int nx = curX + dx[i];
                int ny = curY = dy[i];
                if(nx >=0 && ny >=0 && nx < n && ny < n) {
                    if(map[nx][ny] == 1 && !visited[nx][ny]) {
                        queue.add(new int[]{nx, ny});
                        aparts[complexNum]++;
                        visited[nx][ny] = true;
                    }
                }
            }

        }

    }


}
