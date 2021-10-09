package kakao20210911;

import java.util.*;

public class test1 {

    public static void main(String[] args) {
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};

        String[] id_list2 = {"con", "ryan"};
        String[] report2 = {"ryan con", "ryan con", "ryan con", "ryan con"};
        int k = 2;


        System.out.println(Arrays.toString(solution(id_list, report, k)));
    }

    public static int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];

        // 1. 중복제거
        // 2. 정지된 ID 중 횟수로 찾기
        // 3. 정지된 ID 기준으로 신고한 ID 카운트

        HashSet<String> hashSet = new HashSet<>(Arrays.asList(report));
        Map<String, Integer> map = new HashMap();
        List<String> targetStopIdList = new ArrayList<>();

        // 1. 중복제거
        ArrayList<String> setList = new ArrayList<>(hashSet);

        // 2. 정지된 ID 중 횟수로 찾기
        for(String reportData : setList) {
            String stopId = reportData.split(" ")[1];
            if(map.containsKey(stopId)) {
                map.replace(stopId, map.get(stopId) + 1);
            } else {
                map.put(stopId, 1);
            }
            if(k <= map.get(stopId) && !targetStopIdList.contains(stopId)) {
                targetStopIdList.add(stopId);
            }
        }

        // 3. 정지된 ID 기준으로 신고한 ID 카운트
//        for (int i=0; i<id_list.length; i++) {
//            for(int z=0; z < setList.size(); z++) {
//                String targetId = setList.get(z);
//                String sendMailId = targetId.split(" ")[0];
//                String stopId = targetId.split(" ")[1];
//
//                for(int j=0; j<targetStopIdList.size(); j++) {
//                    if(id_list[i].equals(sendMailId) && stopId.equals(targetStopIdList.get(j))) {
//                        answer[i] = answer[i] + 1;
//                    }
//                }
//            }
//        }

        Map<String, Integer> resultMap = new HashMap<>();

        for (int i=0; i<report.length; i++) {
            String targetId = report[i];
            String sendMailId = targetId.split(" ")[0];
            String stopId = targetId.split(" ")[1];

            if (!targetStopIdList.contains(stopId)) {
                resultMap.put(sendMailId, resultMap.get(sendMailId) + 1);
            } else {
                resultMap.put(sendMailId, 1);
            }
        }

        for(int i=0; i< id_list.length; i++) {
            if(resultMap.containsKey(id_list[i])) {
                answer[i] = resultMap.get(id_list);
            }
        }

        return answer;
    }

}
