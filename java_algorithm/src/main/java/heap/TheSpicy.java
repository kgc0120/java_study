package heap;

import java.util.PriorityQueue;

public class TheSpicy {

    public static void main(String[] args) {

        int[] scoville = {1, 2, 3, 9, 10, 12};
        int k = 10000;

        System.out.println(solution(scoville, k));

    }

    public static int solution(int[] scoville, int K) {
        int answer = 0;

        PriorityQueue<Integer> qp = new PriorityQueue<>();

        for(int i=0; i<scoville.length; i++) {
            qp.add(scoville[i]);
        }
        while(qp.peek() < K) {

            try {
                int min1 = qp.poll();
                int min2 = qp.poll();
                int sumSpicy = min1 + (min2 * 2);
                qp.add(sumSpicy);
                answer++;
            }catch (NullPointerException e) {
                return -1;
            }

        }

        return answer;
    }

}
