package monthly.code.challenge;

/*
* https://programmers.co.kr/learn/courses/30/lessons/76501
* 음양 더하기
*
* */
public class NegativePositiveNumber {

    public static void main(String[] args) {
        int[] absolutes = {4,7,12};
        boolean[] signs = {true,false,true};

        int[] param1 = {1,2,3};
        boolean[] param2 = {false,false,true};

        System.out.println(solution(param1, param2));
    }

    public static int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for (int i = 0; i < absolutes.length; i++) {
            if (signs[i]) answer += absolutes[i];
            else answer -= absolutes[i];

        }
        return answer;
    }
}
