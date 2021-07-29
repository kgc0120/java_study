package stack;

import java.util.Stack;

/*
* https://programmers.co.kr/learn/courses/30/lessons/12973
* stack 문제
*
 */
public class MatchRemove {

    public static void main(String[] args) {

        String param = "baabaa";
        String param2 = "cdcd";
        System.out.println(solution(param));
    }

    public static int solution(String s)
    {
        int answer = -1;

        /*
        * 개선점 1
        * Stack<Character> stack = new Stack<>();
        * Character type Stack 생성
        * */
        Stack<String> stack = new Stack<>();


        /*
         * 개선점 2
         * for(char c : s.toCharArray())
         * toCharArray() 메소드 이용해서 for each문 사용 가능
         * */
        for (int i = 0; i < s.length(); i++) {
            if(!stack.isEmpty()) {
                String peek = stack.peek();
                if(peek.equals(Character.toString(s.charAt(i)))) {
                    stack.pop();
                } else {
                    stack.push(Character.toString(s.charAt(i)));
                }
            } else {
                stack.push(Character.toString(s.charAt(i)));
            }
        }
        if(stack.size() > 0) {
            answer = 0;
        } else {
            answer = 1;
        }

        /*
        *
        * 개선점 3
        * 삼항연산자
        * return statck.size() > 0?  0 : 1;
        * */
        return answer;
    }

}
