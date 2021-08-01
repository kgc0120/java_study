package kakao;

import java.util.*;
/*
* https://programmers.co.kr/learn/courses/30/lessons/72411?language=python3
* 메뉴 리뉴얼
*
* */
public class menuRenewal {
    static HashMap<String,Integer> map;
    static int m;


    public static void main(String[] args) {

        String[] orders = {"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"};
        int[] course = {2,3,4};
//        solution(orders, course);
        System.out.println(Arrays.toString(solution(orders, course)));
    }

    public static String[] solution(String[] orders, int[] course) {
        PriorityQueue<String> pq = new PriorityQueue<>();
        for (int i=0; i < course.length; i++){
            map = new HashMap<>();
            m = 0;
            for (int j=0; j < orders.length; j++) {
                find(0, "", course[i], 0, orders[j]);
            }
            for (String s : map.keySet()){
                if (map.get(s) == m && m > 1){
                    pq.offer(s);
                }
            }
        }

        String ans[] = new String[pq.size()];
        int k=0;
        while (!pq.isEmpty()){
            ans[k++] = pq.poll();
        }
        return ans;
    }

    static void find(int cnt, String str, int targetNum, int idx, String word){
        if (cnt == targetNum){
            char[] c = str.toCharArray();
            Arrays.sort(c);
            String temps = "";
            for (int i=0; i < c.length; i++) temps += c[i];
            map.put(temps, map.getOrDefault(temps,0)+1);
            m = Math.max(m, map.get(temps));
            return;
        }
        for (int i=idx;i<word.length();i++){
            char now =word.charAt(i);
            find(cnt+1,str+now, targetNum,i+1, word);
        }
    }

}
