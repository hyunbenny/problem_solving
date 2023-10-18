import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {        
        List<Integer> answer = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % divisor == 0) answer.add(arr[i]);
        }
        
        if(answer.size() == 0) {
            answer.add(-1);
        }else {
            answer.sort((o1, o2) -> o1 - o2);
        }
        
        return answer.stream().mapToInt(i -> i.intValue()).toArray();
    }
}