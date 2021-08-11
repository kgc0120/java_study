package binarysearch;

import java.util.Arrays;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/43238
 * 입국심사
 */
public class Immigration {

    public static void main(String[] args) {

        int n = 6;
        int[] times = {7, 10};
        System.out.println(solution(n, times));

    }

    public static long solution(int n, int[] times) {
        long answer = 0;

        long maxTime;
        long minTime = 0;

        Arrays.sort(times);
        maxTime = (long)times[times.length-1] * n; // 최악의 경우

        while(minTime <= maxTime) {

            long mid = (maxTime + minTime) / 2; // 이분탐색을 위한 중간값
            long sum = 0; // 총 심사 수
            for (int i = 0; i < times.length; i++) {
                sum += mid / times[i]; // 심사한 수
            }

            if(sum < n) {
                minTime = mid + 1;// 시간 부족, 최소 시간이 1분이기 때문에 1분 추가
            } else {
                maxTime = mid - 1;
                answer = mid;
            }

        }

        return answer;
    }

}
