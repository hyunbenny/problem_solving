import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
       int answer = 0;

        // score: 1 2 3 1 2 3 1
        // sort:  1 1 1 2 2 3 3
        Arrays.sort(score);

        // 꺼내기: 정렬이 되어 있으므로 m의 배수 번째 값만 가져와서 계산하면 됨
        for(int i = score.length; i >= m; i -= m){
            answer += score[i -m] * m;
        }

        return answer;
    }
}