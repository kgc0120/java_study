package implement;

import java.util.Arrays;

/*
* https://programmers.co.kr/learn/courses/30/lessons/70129
* 이진 변환 반복하기
*
* */
public class BinaryNumberRepeat {


    public static void main(String[] args) {

        String param = "110010101001";
        String param2 = "01110";
        String param3 = "1111111";
        System.out.println(Arrays.toString(solution(param3)));

    }

    public static int[] solution(String s) {

        int zeroCnt = 0;
        int repeatCnt = 0;

        while (s.length() > 1) {
            String[] temp =  s.split("");
            String result = ""; // 속도 계선 StringBuilder?
            for (int i = 0; i < temp.length; i++) {
                if (temp[i].equals("0")) {
                    zeroCnt ++;
                } else {
                    result += temp[i];
                }
            }
            repeatCnt ++;
            s = Integer.toBinaryString(result.length());
        }

        int[] answer = {repeatCnt, zeroCnt};
        return answer;
    }

}
