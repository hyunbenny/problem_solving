import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
   public int[] solution(int k, int[] scores) {
        int[] answer = new int[scores.length];
        List<Integer> table = new ArrayList<>();

        for (int i = 0; i < scores.length; i++) {
            int score = scores[i];
            if(i <= k - 1){
                table.add(score);
                int min = table.stream().mapToInt(n -> n).min().getAsInt();
                answer[i] = min;
            }else{
                // 기존 table 데이터와 비교 -> table의 최소값 구하고 비교 후, 교체
                int min = table.stream().mapToInt(n -> n).min().getAsInt();
                if (score > min) {
                    table.remove(table.indexOf(min));
                    table.add(score);
                }
            }
            table = table.stream().sorted((o1, o2) -> o2 - o1).collect(Collectors.toList());
            answer[i] = table.stream().mapToInt(n -> n).min().getAsInt();
        }


        return answer;
    }
}