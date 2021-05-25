package monthly.code.challenge;

import java.util.Arrays;
/*
* https://programmers.co.kr/learn/courses/30/lessons/77885
* 2개 이하로 다른 비트
* */
public class TwoBelowDifferentBit {
    public static void main(String[] args) {
        long[] numbers = {2,7};
        System.out.println(Arrays.toString(solution2(numbers)));
//        long l = 7 ^ 9;
//        System.out.println("l = " +l);
//        String s = Integer.toBinaryString((int) l);
//        System.out.println(s);
    }
    // 시간초과...
    public static long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];
        boolean isCntCkeck = false;
        for (int i = 0; i < numbers.length; i++) {
            long num = numbers[i];
            while(!isCntCkeck) {
                int cnt = 0;
                long l = numbers[i] ^ ++num;
                String s = Long.toBinaryString(l);
                for (int j = 0; j < s.length(); j++) {
                    if(s.charAt(j) == '1') cnt++;
                    if(cnt > 2) break;
                }
                if(cnt<=2) isCntCkeck = true;
            }
            answer[i] = num;
            isCntCkeck = false;
        }
        return answer;
    }

    // 참고...
    public static long[] solution2(long[] numbers) {
        long[] answer = new long[numbers.length];

        for(int i=0; i<numbers.length; i++){
            String BinaryString =  Long.toBinaryString(numbers[i]);
            if(numbers[i]%2==0){
                //짝수 가장 낮은 0만 바꾸기
                //사실상 맨 마지막 자리는 0이기에 +1만 해주면 된다.
                answer[i] = numbers[i]+1;
            }else{
                //홀수 가장 낮은 0을 1로 바꾸고 , 방금 바꾼것보다는 나중 위치에서 1을 0으로 바꾸기
                int lastindex =  BinaryString.lastIndexOf("0");
                int firstindex = BinaryString.indexOf("1",lastindex);
                if(lastindex==-1){
                    //0이 없는경우 +1을 해주고
                    //앞의 10은 놔두고 나머지는 다 1로 해준다.
                    numbers[i]+=1;
                    BinaryString =  Long.toBinaryString(numbers[i]);
                    BinaryString = BinaryString.substring(0,2)+
                            BinaryString.substring(2,BinaryString.length()).replace("0","1");

                }else{
                    BinaryString = BinaryString.substring(0,lastindex)+"10"+
                            BinaryString.substring(firstindex+1,BinaryString.length());
                }
                answer[i] = Long.parseLong(BinaryString,2);
            }
        }
        return answer;
    }

}
