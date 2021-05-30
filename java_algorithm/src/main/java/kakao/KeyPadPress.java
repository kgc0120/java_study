package kakao;

/*
*https://programmers.co.kr/learn/courses/30/lessons/67256
* 키패드 누르기
* 참고 - https://velog.io/@jimmyjoo/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4-%ED%82%A4%ED%8C%A8%EB%93%9C-%EB%88%84%EB%A5%B4%EA%B8%B0
* */
public class KeyPadPress {

    public static void main(String[] args) {
        int[] paramNum = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String paramHand = "right";
        System.out.println(solution(paramNum, paramHand));
    }

    public static String solution(int[] numbers, String hand) {
        StringBuilder sb = new StringBuilder();
        int leftHand = 10;
        int rightHand = 12;
        for (int number : numbers) {
            if(number == 1 || number == 4 || number == 7 ) {
                sb.append("L");
                leftHand = number;
            } else if(number == 3 || number == 6 || number == 9 ) {
                sb.append("R");
                rightHand = number;
            } else {
                int leftDistance = getDistance(leftHand, number);
                int rightDistance = getDistance(rightHand, number);

                if(leftDistance > rightDistance) {
                    sb.append("R");
                    rightHand = number;
                }else if(leftDistance < rightDistance) {
                    sb.append("L");
                    leftHand = number;
                }else {
                    if(hand.equals("right")) {
                        sb.append("R");
                        rightHand = number;
                    }
                    else {
                        sb.append("L");
                        leftHand = number;
                    }
                }

            }
        }
        return sb.toString();
    }

    public static int getDistance(int localNum, int targetNum) {

        localNum = (localNum == 0) ? 11 : localNum;
        targetNum = (targetNum == 0) ? 11 : targetNum;

        int localX = (localNum-1) / 3;
        int localY = (localNum-1) % 3;
        int targetX = targetNum / 3;
        int targetY = 1;

        int result = Math.abs(targetX - localX) + Math.abs(targetY - localY);
        return result;
    }
}
