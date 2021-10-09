package kakao;

import java.util.HashMap;
import java.util.Map;

public class EngWord {

    public static void main(String[] args) {

//        String s = "one4seveneightone";
//        String s =  "23four5six7";
//        String s =  "2three45sixseven";
        String s =  "123";
        System.out.println(solution(s));
    }

    public static int solution(String s) {
        int answer = 0;
        String[] numberStrArr = {"zero", "one", "two", "three", "four", "five","six","seven","eight","nine"};

        Map<String, String> engWordMap = new HashMap<>();
        engWordMap.put("zero", "0");
        engWordMap.put("one", "1");
        engWordMap.put("two", "2");
        engWordMap.put("three", "3");
        engWordMap.put("four", "4");
        engWordMap.put("five", "5");
        engWordMap.put("six", "6");
        engWordMap.put("seven", "7");
        engWordMap.put("eight", "8");
        engWordMap.put("nine", "9");

        for (String s1 : numberStrArr) {
            if(s.contains(s1)) {
                s = s.replace(s1 , engWordMap.get(s1));
            }
        }

        answer = Integer.parseInt(s);

        return answer;
    }

}
