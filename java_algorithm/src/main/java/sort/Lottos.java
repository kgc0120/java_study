package sort;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Lottos {

    public static void main(String[] args) {

//        int[] lottos = {44, 1, 0, 0, 31, 25};
//        int[] win_nums = {31, 10, 45, 1, 6, 19};

//        int[] lottos = {0, 0, 0, 0, 0, 0};
//        int[] win_nums = {38, 19, 20, 40, 15, 25};

        int[] lottos = {45, 4, 35, 20, 3, 9};
        int[] win_nums = {20, 9, 3, 45, 4, 35};

        System.out.println(Arrays.toString(solution(lottos, win_nums)));

    }

    public static int[] solution(int[] lottos, int[] win_nums) {
        Map<Integer, Integer> lottosMap = new HashMap<>();
        lottosMap.put(6, 1);
        lottosMap.put(5, 2);
        lottosMap.put(4, 3);
        lottosMap.put(3, 4);
        lottosMap.put(2, 5);
        lottosMap.put(1, 6);
        lottosMap.put(0, 6);

        int[] answer = new int[2];

        Arrays.sort(lottos);
        Arrays.sort(win_nums);

        int cnt = 0; // 최소
        int zero = 0; // cnt + zero = 최대
        for (int lotto : lottos) {
            for (int i = 0; i < win_nums.length; i++) {
                if(lotto == 0) {
                    zero++;
                    break;
                }
                int win_num = win_nums[i];
                if(lotto == win_num) {
                    cnt++;
                    i  = i;
                    break;
                }
            }
        }
        answer[1] = lottosMap.get(cnt);
        answer[0] = lottosMap.get(cnt+zero);

        return answer;
    }

}
