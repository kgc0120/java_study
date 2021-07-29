package kakao;

import java.util.Locale;

/*
* https://programmers.co.kr/learn/courses/30/lessons/72410
* 문자열 문제
* 정규표현식 사용법
 */
public class NewIdRecommend {

    public static void main(String[] args) {

        //String newId = "...!@BaT#*..y.abcdefghijklm";
        String newId = "abcdefghijklmn.p";
        //String newId = "";
        System.out.println(solution(newId));
    }

    public static String solution(String new_id) {
        String answer = "";
        
        // 1. 소문자로 변환
        answer = new_id.toLowerCase();

        // 2. 알파벳 소문자, 숫자, 빼기, 밑줄, 마침표 를 제외한 모든 문자 제거
        String match = "[^a-z\\d\\-_.]*";
        answer =answer.replaceAll(match, "");

        // 3. . 2번이상 하나로 치환
        //match = "\\.{2,}";
        match = "[.]{2,}";
        answer =answer.replaceAll(match, ".");

        // 4. 처음과 끝에 마침표 있으면 제거거
        match = "^[.]|[.]$";
        answer =answer.replaceAll(match, "");

        // 5. 빈 문자열이면 "a" 대입
        if(answer.length() <= 0) {
            answer = "a";
        }

        // 6. 16이상이면 15개의 문자 제외하고 모두 제거
        if(answer.length() >= 16) {
            answer = answer.substring(0, 15);
            match = "[.]$";
            answer =answer.replaceAll(match, "");
        }

        System.out.println(answer);

        // 7. id 길이가 2자 이하라면 마지막 문자를 id 길이가 3이 될 때까지 반복
        if(answer.length() <= 2) {
            String lastStr = answer.substring(answer.length()-1, answer.length());
            for (int i = 0;  answer.length() < 3; i++) {
                 answer += lastStr;
            }
        }


       return answer;
    }

}
