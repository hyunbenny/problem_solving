import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] result = {};
        
        int[] one = {1, 2, 3, 4, 5}; // 5개
        int[] two = {2, 1, 2, 3, 2, 4, 2, 5}; // 8개
        int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}; // 10개
        
        int oneScore = 0;
        int twoScore = 0;
        int threeScore = 0;
                
        for(int i = 0; i < answers.length; i++){
            int answer = answers[i];
            
            // 예를 들어 3번의 경우, i == 10(11번 문제)일 때, index = 0이어야 한다.
            if(answer == one[i % one.length]) oneScore++;
            if(answer == two[i % two.length]) twoScore++;
            if(answer == three[i % three.length]) threeScore++;
        }
        
        List<Integer> tmpList = new ArrayList<>();
        int max = Math.max(oneScore, Math.max(twoScore, threeScore));
        if(max == oneScore) tmpList.add(1);
        if(max == twoScore) tmpList.add(2);
        if(max == threeScore) tmpList.add(3);
        
        
        result = new int[tmpList.size()];
        for(int i = 0; i < tmpList.size(); i++){
            result[i] = tmpList.get(i);
        }
        
        return result;
    }
}