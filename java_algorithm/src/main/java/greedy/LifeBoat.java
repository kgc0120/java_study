package greedy;


import java.util.Arrays;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/42885
 * 구명보트
 */
public class LifeBoat {

    public static void main(String[] args) {

        int[] people = {70, 50, 80, 50};
        int limit = 100;

        System.out.println(solution(people, limit));
    }

    public static int solution(int[] people, int limit) {
        int answer = 0;

        Arrays.sort(people);
        int min =0;

        for (int i = people.length-1; min <= i; i--) {
            if(people[i] + people[min] <= limit) min++;
            answer++;

        }

        return answer;
    }


}
