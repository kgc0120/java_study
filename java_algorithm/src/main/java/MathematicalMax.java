import java.util.ArrayList;
import java.util.List;

public class MathematicalMax {

    public static void main(String[] args) {
        String expression = "100-200*300-500+20";
        String param = "50*6-3*2";
        System.out.println(solution(param));

    }

    public static long solution(String expression) {
        long answer = -1;
        List<String> list = new ArrayList<>();
        List<Character> symbolList = new ArrayList<>();

        String str = "";
        for(char a : expression.toCharArray()) {
            if(a == '*' || a == '-' || a=='+') {
                list.add(str);
                symbolList.add(a);
                str = "";
            } else {
                str +=a;
            }
        }
        list.add(str);

        String[][] symbolPatten = {{"-", "+", "*"},
                {"-", "*", "+"},
                {"+", "-", "*"},
                {"+", "*", "-"},
                {"*", "-", "+"},
                {"*", "+", "-"}};

        for(int i=0; i<symbolPatten.length; i++) {
            long result = calculate(list, symbolList, symbolPatten[i]);
            answer = Math.max(answer, Math.abs(result));
        }


        return answer;
    }

    public static long calculate(List<String> splitData, List<Character> symbols, String[] patten) {

        int pattenCnt = 0;
        long tempNum = 0;

        ArrayList<String> newList = new ArrayList<String>();
        ArrayList<Character> newSymbols = new ArrayList<Character>();

        newList.addAll(splitData);
        newSymbols.addAll(symbols);

        while(newList.size() > 1) {
            for(int i=0; i<newSymbols.size(); i++) {
                String symbol = String.valueOf(newSymbols.get(i));
                if(symbol.equals(patten[pattenCnt])) {
                    if(patten[pattenCnt].equals("+")) {
                        tempNum = Long.parseLong(newList.get(i)) + Long.parseLong(newList.get(i+1));
                    } else if(patten[pattenCnt].equals("-")) {
                        tempNum = Long.parseLong(newList.get(i)) - Long.parseLong(newList.get(i+1));
                    } else {
                        tempNum = Long.parseLong(newList.get(i)) * Long.parseLong(newList.get(i+1));
                    }
                    newList.add(i, String.valueOf(tempNum));
                    newList.remove(i+1);
                    newList.remove(i+1);
                    newSymbols.remove(i);
                    i =-1;
                }
            }
            pattenCnt++;
        }

        return tempNum;
    }


}
