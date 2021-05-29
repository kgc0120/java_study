package programming.meister;

import java.util.HashSet;

/*
* https://programmers.co.kr/learn/courses/30/lessons/1845
* 폰켓몬
* */
public class Phonekemon {

    public static void main(String[] args) {
        int[] params = {3,3,3,2,2,4};
        int[] params2 = {3,1,2,3};
        int[] params3 = {3,3,3,2,2,2};
        System.out.println(solution(params3));
    }

    public static int solution(int[] nums) {
        int answer = 0;

        int maxPhonekemon = nums.length/2;

        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            set.add(num);
        }
        if(set.size()>=maxPhonekemon) return  answer = maxPhonekemon;

        return set.size();
    }

}
