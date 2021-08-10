package bfs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/43164
 * 여행경로
 *
 */
public class TravelSearch {
    static boolean[] check;
    static List<String> resultLst;
    //	static int lastCnt = 0;
    static int curCnt = 0;


    public static void main(String[] args) {

        String[][] tickets = {{"ICN", "JFK"}, {"HND", "IAD"}, {"JFK", "HND"}};

        System.out.println(Arrays.toString(solution(tickets)));
    }

    public static String[] solution(String[][] tickets) {
        String[] answer = {};
        resultLst = new ArrayList<>();
        check = new boolean[tickets.length];

        // 2차원 배열 정렬
        Arrays.sort(tickets, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                // TODO Auto-generated method stub
                if(o1[0].toString().contentEquals(o2[0].toString()))
                    return o1[1].toString().compareTo(o2[1].toString());
                else
                    return o1[0].toString().compareTo(o2[0].toString());
            }

        });
        resultLst.add("ICN");
        dfs(tickets, check, "ICN", 0);

        answer = resultLst.toArray(new String[resultLst.size()]);
        return answer;
    }

    public static boolean dfs(String[][] tickets, boolean[] check, String Airline, int cnt) {
        if(cnt == tickets.length) return true;

        for(int i=0; i < tickets.length; i++ ) {
            if(tickets[i][0].equals(Airline) && !check[i]) {
                check[i] = true;
                resultLst.add(tickets[i][1]);
                if(dfs(tickets, check, tickets[i][1], curCnt+=1)) return true;
                check[i] = false;
            }
        }
        resultLst.remove(resultLst.size()-1);
        curCnt-=1;
        return false;
    }
}

