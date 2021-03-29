package sort;

import java.util.Arrays;
import java.util.HashSet;

public class PullAndAdd {

    public static void main(String[] args) {
        int[] param = {2, 1, 3, 4, 1};
        int[] param2 = {5, 0, 2, 7};
        int[] result = solution(param2);
        System.out.println(Arrays.toString(result));
    }

    public static int[] solution(int[] numbers) {

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < numbers.length-1; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }

        int num = 0;
        int[] answer = new int[set.size()];
        for(int i : set) {
            answer[num] = i;
            num++;
        }
        Arrays.sort(answer);

        return answer;

    }

}
