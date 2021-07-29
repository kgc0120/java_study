package stack;

import java.util.Stack;

public class MatchRemove {

    public static void main(String[] args) {

        String param = "baabaa";
        String param2 = "cdcd";
        System.out.println(solution(param));
    }

    public static int solution(String s)
    {
        int answer = -1;

        Stack<String> stack = new Stack<>();
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
        return answer;
    }

}
