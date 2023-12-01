import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;

        // 데이터 세팅
        Map<Integer, Integer> map = new HashMap<>();

        for (int i : tangerine) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        // 내림차순 정렬
        int sum = 0;
        List<Integer> values = new ArrayList<>(map.values());
        Collections.sort(values, Collections.reverseOrder());

        // 큰 값부터 체크
        for (Integer i : values) {
            if (sum + i >= k) {
                answer++;
                break;
            } else {
                sum += i;
                answer++;
            }
        }

        return answer;
    }
}
