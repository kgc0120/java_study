package monthly.code.challenge;

import java.util.ArrayList;
import java.util.Collections;

public class ThreeBaseFlip {

    public static void main(String[] args) {

        int param = 45;
        int param2 = 125;
        int param3 = 3;

        System.out.println(otherSolution(param2));
    }

    public static int solution(int n) {
        int answer = 0;
        ArrayList<Integer> threeSystemList = new ArrayList<Integer>();

        if(n < 3) {
            threeSystemList.add(n);
        }

        while( n >= 3 ) {
            threeSystemList.add(n % 3);
            n = n / 3;
            if(n < 3 ) {
                threeSystemList.add(n);
            }
        }

        Collections.reverse(threeSystemList);
        for (int i = 0; i < threeSystemList.size(); i++) {
            answer += threeSystemList.get(i) * Math.pow(3, i) ;
        }

        return answer;
    }

    public static int otherSolution(int n) {
        String a = "";

        while(n > 0){
            a = (n % 3) + a;
            n /= 3;
        }
        a = new StringBuilder(a).reverse().toString();


        return Integer.parseInt(a,3);
    }

}
