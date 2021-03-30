package hash;


import java.util.HashMap;
import java.util.Map;

/*
* 위장
* https://programmers.co.kr/learn/courses/30/lessons/42578
* */
public class Camouflage {

    public static void main(String[] args) {
        String[][] param =  {{"yellowhat",      "headgear"  },
                             {"bluesunglasses", "eyewear"   },
                             {"green_turban",   "headgear"  }};

        String[][] param2 = {{"crowmask", "face"}, {"bluesunglasses", "face"}, {"smoky_makeup", "face"}};

        System.out.println(solution(param));
    }

    public static int solution(String[][] clothes) {
        int answer = 1;
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < clothes.length; i++) {
            if(map.isEmpty()) {
                map.put(clothes[0][1], 1);
                continue;
            }
            if(map.containsKey(clothes[i][1])) {
                map.put(clothes[i][1], map.get(clothes[i][1]) + 1);
            } else {
                map.put(clothes[i][1], 1);
            }
        }

        for (Integer value : map.values()) {
             answer *= (value + 1);
        }
        return answer-=1;
    }
}
