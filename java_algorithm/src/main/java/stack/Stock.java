package stack;

import java.util.Arrays;

public class Stock {

    public static void main(String[] args) {

//        int[] prices = {1, 2, 3, 2, 3};
//        int[] prices = {1, 2, 3, 2, 3, 1};
//        int[] prices = {1, 2, 3, 2, 2, 3, 1}; // [6, 5, 1, 3, 2, 1, 0] - [6, 5, 1, 3, 2, 1, 0]
//        int[] prices = {1, 1, 1, 1, 1, 1, 1};
        int[] prices = {1, 91, 81, 71, 71, 71, 71, 61, 51, 41}; // [1, 1, 1, 6, 5, 4, 1, 1, 1, 0] - [1, 1, 1, 4, 3, 2, 1, 1, 1, 0]
        //[9, 1, 1, 6, 5, 4, 1, 1, 1, 0] - [9, 1, 1, 4, 3, 2, 1, 1, 1, 0]

        System.out.println(Arrays.toString(solution(prices)));

    }

    public static int[] solution(int[] prices) {
        int[] answer = new int[prices.length];

        int cnt = 0;
        answer[prices.length-1] = 0;
        for (int i = prices.length-2 ; i >= 0; i--) {
            cnt++;
            if(prices[i] <= prices[i+1]) {
                answer[i] = cnt;
            } else {
                answer[i] = 1;
            }
        }
        return answer;
    }

//    public static int[] solution(int[] prices) {
//        int[] answer = new int[prices.length];
//
//        for(int i=0; i < prices.length; i++) {
//            for(int j=i+1; j < prices.length; j++) {
//                answer[i]++;
//                if(prices[j] < prices[i]) {
//                    break;
//                }
//            }
//
//        }
//        return answer;
//    }
}
