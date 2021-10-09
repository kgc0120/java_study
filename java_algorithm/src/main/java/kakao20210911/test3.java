package kakao20210911;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class test3 {

    public static void main(String[] args) {

        int[] fees = {180, 5000, 10, 600};
        String[] records = {"05:34 5961 IN",
                            "06:00 0000 IN",
                            "06:34 0000 OUT",
                            "07:59 5961 OUT",
                            "07:59 0148 IN",
                            "18:59 0000 IN",
                            "19:09 0148 OUT",
                            "22:59 5961 IN",
                            "23:00 5961 OUT"};

//        String[] records = {"05:34 5961 IN",
//                "23:00 5961 OUT"};


        System.out.println(Arrays.toString(solution(fees, records)));
    }

    public static int[] solution(int[] fees, String[] records) {


        Map<String, Integer> map = new HashMap();
        Map<String, Integer> resultMap = new HashMap();

        // 1. 차량마다 총 시간 계산
        for(int i=0; i<records.length; i++) {
            String carNumber = records[i].split(" ")[1];
            int hour = Integer.parseInt(records[i].split(" ")[0].split(":")[0]) * 60;
            int minute = Integer.parseInt(records[i].split(" ")[0].split(":")[1]);
            int time = hour + minute;
            if(map.containsKey(carNumber)) {
                time = time - map.get(carNumber);

                if(resultMap.containsKey(carNumber)){
                    resultMap.put(carNumber, resultMap.get(carNumber) + time);
                } else {
                    resultMap.put(carNumber, time);
                }
                map.remove(carNumber);
            } else {
                map.put(carNumber, time);

            }
        }

        // 2. 출차 기록이 없는 차량
        int lastTime = (23 * 60) + 59;
        for (String car : map.keySet()) {
            int time = lastTime - map.get(car);
            if(resultMap.containsKey(car)){
                resultMap.put(car, resultMap.get(car) + time);
            } else {
                resultMap.put(car, time);
            }
        }

        // 3. 차량 별 요금 계산
        for(String car : resultMap.keySet()) {
            if(resultMap.get(car) <= fees[0]) {
                resultMap.replace(car, fees[1]);
            } else{
                int finalFee = fees[1] + (int) Math.ceil((double) (resultMap.get(car) - fees[0]) / fees[2]) * fees[3];
                resultMap.replace(car, finalFee);
            }
        }

        // 4. 차량번호가 작은 자량 순서대로 출력
        Object[] mapkey = resultMap.keySet().toArray();
        Arrays.sort(mapkey);
        int[] answer = new int[mapkey.length];

        int cnt =0;
        for(Object car : mapkey) {
            answer[cnt] = resultMap.get(car);
            cnt++;
        }

        return answer;
    }


}
