import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] numbers) {
        

        Set<Integer> sum = new HashSet<>();

        for(int i = 0 ; i < numbers.length - 1; i++){
            for(int j = i + 1; j < numbers.length; j++){
                sum.add(numbers[i] + numbers[j]);
            }
        }
        
        List<Integer> sorted = sum.stream().sorted((o1, o2) -> o1 - o2).collect(Collectors.toList());
        
        int[] answer = new int[sum.size()];
        for (int i = 0; i < sorted.size(); i++) {
            answer[i] = sorted.get(i);
        }


        return answer;
    }
}