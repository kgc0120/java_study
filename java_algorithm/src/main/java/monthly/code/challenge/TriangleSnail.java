package monthly.code.challenge;


import java.util.Arrays;

/*
* 삼각 달팽이
* https://programmers.co.kr/learn/courses/30/lessons/68645
* */
public class TriangleSnail {

    public static void main(String[] args) {

        int param = 4;
        System.out.println(Arrays.toString(solution(param)));

    }

    public static int[] solution(int n) {

        int maxNum = getMaxNum(n); // 최댓값 가져오기
        int[] answer = new int[maxNum];
        int[][] array = new int[n][n];
        int compareNum = 1;
        int i = 0, j = 0;

        if(n == 1) {
            answer[0] = 1;
            return answer;
        }

        while (maxNum >= compareNum) {

            // 세로로 값 입력
            while (i < n && array[i][j] == 0 && compareNum <= maxNum) {
                array[i++][j] = compareNum;
                compareNum++;
            }

            // 가로로 값 입력
            i -=1;
            j+=1;
            while(j < n  && array[i][j] == 0 && compareNum <= maxNum)  {
                array[i][j++] = compareNum;
                compareNum++;
            }

            // 대각선 값 입력
            i -= 1;
            j -= 2;
            while (array[i][j] == 0 && array[i-1][j-1] == 0 && compareNum <= maxNum) {
                array[i--][j--] = compareNum;
                compareNum++;
            }
        }

        int tmp = 0;
        for (int k = 0; k < array.length; k++) {
            for (int l = 0; l <= k; l++) {
                answer[tmp++] = array[k][l];
            }
        }

        return answer;
    }

    private static int getMaxNum(int n) {
        int maxNum = 0;
        for (int i = 1; i <= n; i++) {
            maxNum += i;
        }
        return maxNum;
    }

}
