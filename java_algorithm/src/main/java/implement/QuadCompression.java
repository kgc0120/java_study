package implement;

import java.util.ArrayList;
import java.util.List;

public class QuadCompression {

    static List<Integer> arrayList = new ArrayList<>();
    public static void main(String[] args) {
        int[][] param = {{1,1,0,0},{1,0,0,0},{1,0,0,1},{1,1,1,1}};
        int[][] param2 = {{1,1,1,1,1,1,1,1},{0,1,1,1,1,1,1,1},{0,0,0,0,1,1,1,1},{0,1,0,0,1,1,1,1},{0,0,0,0,0,0,1,1},{0,0,0,0,0,0,0,1},{0,0,0,0,1,0,0,1},{0,0,0,0,1,1,1,1}};

        solution(param2);
    }

    public static int[] solution(int[][] arr) {
        int[] answer = {0, 0};
        quad(arr, 0, 0, arr.length);
        for (Integer param : arrayList) {
            if (param == 0) answer[0]+=1;
            else answer[1] +=1;
        }
        return answer;
    }

    private static void quad(int[][] arr, int start, int end, int arrLength) {
        boolean isAllSame = true;
        for (int i = start; i < start + arrLength; i++) {
            for (int j = end; j < end + arrLength; j++) {
                if(arr[start][end] != arr[i][j]) {
                    isAllSame = false;
                }
            }
        }

        if(isAllSame) {
            arrayList.add(arr[start][end]);
        } else {
            arrLength /= 2;
            quad(arr, start, end, arrLength);
            quad(arr, start, end+arrLength, arrLength);
            quad(arr, start + arrLength, end, arrLength);
            quad(arr, start + arrLength, end + arrLength, arrLength);
        }
    }

    private static void stringToArrPrint() {
        String paramToArr = "[[1,1,1,1,1,1,1,1],[0,1,1,1,1,1,1,1],[0,0,0,0,1,1,1,1],[0,1,0,0,1,1,1,1],[0,0,0,0,0,0,1,1],[0,0,0,0,0,0,0,1],[0,0,0,0,1,0,0,1],[0,0,0,0,1,1,1,1]]";
        StringBuilder stringBuilder = new StringBuilder();
        String[] split = paramToArr.split("");
        for (int i=0; i<paramToArr.length(); i++) {
            if (split[i].contains("[")) {
                stringBuilder.append("{");
            } else if (split[i].contains("]")){
                stringBuilder.append("}");
            } else {
                stringBuilder.append(split[i]);
            }
        }
        System.out.println(stringBuilder);
    }

}
