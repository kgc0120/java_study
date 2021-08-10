package fullscanning;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/42839
 * 소수 찾기
 */

public class SearchDecimal {

    static int resultData = 0;
    static Set<Integer> set = new HashSet<>();

    public static void main(String[] args) {
//        String param = "17";
//        String param = "011";
//        String param = "333";
        String param = "11112";
        System.out.println(solution(param));
    }

    public static int solution(String numbers) {
        int answer = 0;

        int[] array = new int[numbers.length()];
        for(int i=0; i<numbers.length(); i++) {
            array[i] = numbers.charAt(i) - '0';
        }

        int length = array.length;
        List<Integer> output = new ArrayList<Integer>();
        boolean[] isVisit = new boolean[length];

        for(int cnt=1; cnt<=length; cnt++) {
            permutation(array, output, isVisit, length, cnt);
        }

//		System.out.println(set.toString());
        checkDecimal();
        return answer = resultData;
    }

    // 경우의 수 찾기
    public static void permutation(int[] array, List output, boolean[] isVisit, int length, int count) {
        if(count==0) {
            if(output.size() >= 1) {
                String intToStr = "";
                for(int i=0; i < output.size(); i++) {
                    intToStr += output.get(i);
                }
                set.add(Integer.parseInt(intToStr));
            }
            output.clear();
            return;
        }
        for(int i=0; i < length; i++) {
            if(isVisit[i]!=true) {
                isVisit[i] = true;
                output.add(array[i]);
                permutation(array, output, isVisit, length, count-1);
                isVisit[i] = false;
            }
        }
    }

    // 경우의 수중 소수 찾기
    public static void checkDecimal() {

        Iterator<Integer> iter = set.iterator();

        while (iter.hasNext()) {
            int temp = iter.next();
            int cnt =0;
//		    System.out.println(temp);
            if(temp <= 1) {
                continue;
            } else if(temp == 2 || temp == 3) {
                System.out.println(temp);
                resultData++;
                continue;
            }
            for(int i=2; i * i <= temp; i++) {
                if(temp % i == 0) {
                    cnt++;
                    break;
                }
            }
            if(cnt == 0) {
                System.out.println(temp);
                resultData++;
            }

        }
    }

}
