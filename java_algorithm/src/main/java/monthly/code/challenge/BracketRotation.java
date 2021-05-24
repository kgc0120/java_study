package monthly.code.challenge;

public class BracketRotation {

    public static void main(String[] args) {
        String param = "[](){}";
        String param2 = "}]()[{";
        String param3 = "[)(]";
        String param4 = "}}}";
        String param5 = "{}";
        System.out.println(solution2(param));
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
        StringBuffer sb = new StringBuffer();
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
}
