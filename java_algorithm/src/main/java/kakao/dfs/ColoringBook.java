package kakao.dfs;

import java.util.Arrays;

/*
* https://programmers.co.kr/learn/courses/30/lessons/1829
* 카카오프렌즈 컬리링북
*
* */
public class ColoringBook {

    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};
    static int areaCnt = 0;

    public static void main(String[] args) {

        int m = 6;
        int n = 4;
        int[][] picture = {{1, 1, 1, 0}, {1, 2, 2, 0}, {1, 0, 0, 1}, {0, 0, 0, 1}, {0, 0, 0, 3}, {0, 0, 0, 3}};

        //System.out.println(solution(m, n, picture).toString());

        System.out.println(Arrays.toString(solution(m, n, picture)));
    }


    public static int[] solution(int m, int n, int[][] picture) {
        int numberOfArea = 0;
        int maxSizeOfOneArea = 0;

        // 방문여부 체크
        boolean[][] check = new boolean[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(picture[i][j] != 0 && !check[i][j]) {
                    numberOfArea ++;
                    dfs(i, j, picture, check);
                }
                if(areaCnt > maxSizeOfOneArea) maxSizeOfOneArea = areaCnt;
                areaCnt = 0;
            }
        }

        int[] answer = new int[2];
        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;
        return answer;
    }


    public static void dfs(int x, int y, int[][] picture, boolean[][] check) {

        // 방문한적 있으면 return
        if(check[x][y]) return;

        // 방문 처리
        check[x][y] = true;

        // 영억 cnt 증가
        areaCnt ++;

        // 상, 하, 좌, 우 탐색
        for (int k = 0; k < 4; k++) {
            int nx = x + dx[k];
            int ny = y + dy[k];

            // 범위 벗어나면 continue
            if(nx < 0 || nx >= picture.length || ny < 0 || ny >= picture[0].length) continue;

            if(picture[x][y] == picture[nx][ny] && !check[nx][ny]) {
                dfs(nx, ny, picture, check);
            }
        }

    }

}
