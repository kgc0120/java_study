package kakao20210911;

public class test2 {

    public static void main(String[] args) {

        System.out.println(solution(1000000, 3));
        System.out.println(solution(900099, 3));
        System.out.println(solution(1004, 9));
        System.out.println(solution(1004, 8));
        System.out.println(solution(1004, 5));
        System.out.println(solution(11, 7));
        System.out.println(solution(0000, 1));
        System.out.println(solution(0000, 10));
        System.out.println(solution(0000, 7));
        System.out.println(solution(999, 7));
        System.out.println(solution(437674, 3));
        System.out.println(solution(110011, 10));
        System.out.println(solution(110011, 3));
        System.out.println(solution(7777, 3));
        System.out.println(solution(123574, 3));

    }

    public static int solution(int n, int k) {
        int answer = 0;

        String ans = "";
        while(n > 0) {
            ans = (n % k) + ans;
            n/=k;
        }
        char[] chars = ans.toCharArray();

        String str = "";
        for(int i=0; i < chars.length; i++){
            if(chars[i] == '0') {
                if(str.isEmpty()) {
                    continue;
                }
                boolean resultPrime = checkPrime(Integer.parseInt(str));
                if(resultPrime) {
                    answer++;
                }
                str = "";

            } else {
                str += chars[i];
            }
        }

        if(!str.isEmpty()) {
            boolean resultPrime = checkPrime(Integer.parseInt(str));
            if(resultPrime) {
                answer++;
            }
        }

        return answer;
    }

    public static boolean checkPrime(int number) {
        // 0 과 1 은 소수가 아니다
        if(number < 2) {
            return false;
        }

        // 2 는 소수다
        if(number == 2) {
            return true;
        }

        for(int i = 2; i < number; i++) {

            // 소수가 아닐경우
            if(number % i == 0) {
                return false;
            }
        }
        // 위 반복문에서 약수를 갖고 있지 않는경우 소수다.
        return true;

    }
}

//211 0 2 0 1 0 1 0 11
//211020101011
