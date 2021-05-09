package monthly.code.challenge;

/*
 * https://programmers.co.kr/learn/courses/30/lessons/68646
 * 풍선 터트리기
 */

public class ToPopaBalloon {

    public static void main(String[] args) {
        int[] param = {9,-1,-5};
        int[] param2 = {-16,27,65,-2,58,-92,-71,-68,-61,-33};

        System.out.println(solution(param));
    }

    public static int solution(int[] a) {

        if(a.length == 1) {
            return 1;
        }
        int answer = 2;
        int minValue = Integer.MAX_VALUE;
        int[] leftMin = new int[a.length];
        int[] rightMin = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            if( minValue > a[i]) {
                minValue = a[i];
            }
            leftMin[i] = minValue;
        }
        minValue = Integer.MAX_VALUE;
        for (int i = a.length - 1; i >= 0 ; i--) {
            if(minValue > a[i]) {
                minValue = a[i];
            }
            rightMin[i] = minValue;
        }

        for (int i = 1; i < a.length-1; i++) {
            if(leftMin[i] < a[i] && rightMin[i] < a[i]) {
                continue;
            }
            answer ++;
        }
        System.out.println("ssh test");
        return answer;
    }

}
