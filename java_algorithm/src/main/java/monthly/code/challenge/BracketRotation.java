package monthly.code.challenge;

import java.util.Stack;

/*
* https://programmers.co.kr/learn/courses/30/lessons/76502
* 괄호 회전하기
*
* */
public class BracketRotation {

    public static void main(String[] args) {
        String param = "[](){}";
        String param2 = "}]()[{";
        String param3 = "[)(]";
        String param4 = "}}}";
        String param5 = "{}";
        System.out.println(solution2(param2));
    }

    public static int solution(String s) {
        int answer = 0;
        String temp = "";
        String rotaion = "";
        for (int i = 0; i < s.length() - 1; i++) {
            for (int j = 0; j < s.length(); j++) {
                if(s.charAt(j) == ']' && !temp.contains("[")) {
                    break;
                } else if(s.charAt(j) == ')' && !temp.contains("(")) {
                    break;
                } else if(s.charAt(j) == '}' && !temp.contains("{")) {
                    break;
                }
                temp += s.charAt(j);
                if(temp.equals(s)) {
                    answer++;
                    temp = "";
                }
            }
            s = s.substring(1, s.length()) + s.charAt(0);
        }
        return answer;
    }

    public static int solution2(String s) {
        int answer = 0;
        StringBuilder temp = new StringBuilder(s);
        for(int i = 0; i < s.length(); i++) {
            if(isCorrectStr(temp.toString())) {
                answer += 1;
            }
            temp.append(temp.charAt(0)).deleteCharAt(0);
        }
        return answer;
    }

    private static boolean isCorrectStr(String str) {

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
             char now = str.charAt(i);
             if(now == '[' || now == '{' || now == '(') {
                 stack.add(now);
             } else if(!stack.isEmpty()){
                if(now == ')' && stack.peek() == '(') {
                    stack.pop();
                }
                else if(now == '}' && stack.peek() == '{') {
                    stack.pop();
                }
                else if(now == ']' && stack.peek() == '[') {
                    stack.pop();
                }
             } else {
                 return false;
             }
        }
        if(stack.isEmpty()) {
            return true;
        }
        return false;
    }
}
