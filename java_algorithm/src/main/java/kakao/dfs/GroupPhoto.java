package kakao.dfs;

import java.util.HashMap;

/*
* https://programmers.co.kr/learn/courses/30/lessons/1835
* 단체사진 찍기
* */
public class GroupPhoto {

    static String[] d;
    static HashMap<Character,Integer> map ;
    static boolean[] visited;
    static int[] ch;
    static int answer;

    public static void main(String[] args) {

        String[] data = new String[]{"N~F=0", "R~T>2"};
        int n = 2;

        System.out.println(solution(n, data));

    }

    public static int solution(int n, String[] data) {
        d = data;
        map = new HashMap<>();
        visited = new boolean[8];

        ch = new int[8];
        answer = 0;
        map.put('A',0);
        map.put('C',1);
        map.put('F',2);
        map.put('J',3);
        map.put('M',4);
        map.put('N',5);
        map.put('R',6);
        map.put('T',7);
        dfs(0);
        return answer;
    }

    public static void dfs(int idx){
        if(idx == 8){
            if(check()) answer++;
        }
        else{
            for(int i = 0; i < 8; i++){
                if(!visited[i]){
                    visited[i] = true;
                    ch[idx] = i;
                    dfs(idx + 1);
                    visited[i] = false;
                }
            }
        }
    }

    public static boolean check(){
        int friends; // 프렌즈
        int opponent; // 상대방
        int interval; //간격
        char inequalitySign; // 부등호
        for(String s : d){
            friends = ch[map.get(s.charAt(0))];

            opponent = ch[map.get(s.charAt(2))];
            inequalitySign = s.charAt(3);
            interval = s.charAt(4)-'0' + 1;

            if(inequalitySign == '='){ if(Math.abs(friends - opponent) != interval) return false;}
            else if(inequalitySign == '>'){ if(Math.abs(friends - opponent) <= interval) return false;}
            else {if(Math.abs(friends - opponent) >= interval) return false;}
        }
        return true;
    }

}
