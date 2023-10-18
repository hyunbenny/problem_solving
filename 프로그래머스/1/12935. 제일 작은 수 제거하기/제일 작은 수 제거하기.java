import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        // 최소값 찾기
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            min = Math.min(arr[i], min);
        }

        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != min) answer.add(arr[i]);
        }

        if(answer.size() == 0) answer.add(-1);

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}