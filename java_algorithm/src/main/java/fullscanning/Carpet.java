package fullscanning;

import java.util.Arrays;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/42842
 * 완전탐색 - 카펫
 */
public class Carpet {

    public static void main(String[] args) {

//        int brown = 10;
//        int yellow = 2;
        int brown = 8;
        int yellow = 1;


        System.out.println(Arrays.toString(solution(brown, yellow)));
    }

    public static int[] solution(int brown, int yellow) {
        int[] answer = new int[2];

        int sumNum = brown + yellow;


        for(int i = 1; i <= sumNum; i++) {
            int row = i; // 가로
            int col = sumNum / row; // 세로

            if(col > row) {
                continue;
            }

            if((row - 2) * (col - 2) == yellow) {
                answer[0] = row;
                answer[1] = col;
            }

        }

        return answer;
    }



}
