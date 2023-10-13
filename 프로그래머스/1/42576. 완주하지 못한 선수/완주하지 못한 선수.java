import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        // 맵에 참가자 이름과 수를 담고
        Map<String, Integer> participantMap = new HashMap<>();
        for (int i = 0; i < participant.length; i++) {
            if (participantMap.containsKey(participant[i])) {
                Integer num = participantMap.get(participant[i]);
                participantMap.put(participant[i], num + 1);
            } else {
                participantMap.put(participant[i], 1);
            }
        }

        // 완주한 사람 목록에 있으면 Map에서 카운트 -1
        for (String completeParticipant : completion) {
            Integer num = participantMap.get(completeParticipant);
            participantMap.put(completeParticipant, num - 1);
        }

        answer = participantMap.entrySet().stream().filter(p -> p.getValue() != 0).findAny().get().getKey();
        return answer;
    }
}