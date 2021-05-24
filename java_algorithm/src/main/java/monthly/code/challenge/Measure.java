package monthly.code.challenge;

public class Measure {

    public static void main(String[] args) {

        int param1 = 24;
        int param2 = 27;
        System.out.println(solution(param1, param2));
    }

    public static int solution(int left, int right) {
        int answer = 0;

        for (int i = left; i <= right; i++) {
            int cnt = 0;
            for (int j = 1; j <= i; j++) {
                if(i % j == 0) {
                    cnt ++;
                }
            }
            if(cnt % 2 == 0) {
                answer += i;
            } else {
                answer -= i;
            }
        }


        return answer;
    }
}
