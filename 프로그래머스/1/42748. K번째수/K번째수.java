import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Solution {
 public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i = 0; i < commands.length; i++){
            int startIdx = commands[i][0] - 1;
            int endIdx = commands[i][1] - 1;
            int target = commands[i][2] - 1;

            // 자르고
            List<Integer> tmpList = new ArrayList<>();
            if(endIdx >= array.length) endIdx = array.length - 1;
            for (int j = startIdx; j <= endIdx; j++) {
                tmpList.add(array[j]);
            }

            // 정렬해서
            tmpList.sort((o1, o2) -> o1 - o2);

            // 나온 숫자를 answer에 추가하기
            answer[i] = tmpList.get(target);
        }
     return answer;
    }
}