import java.util.*;

class Solution {
    public int[] solution(int k, int[] scores) {
        int[] answer = new int[scores.length];

        PriorityQueue<Integer> hallOfFame = new PriorityQueue<>();

        for (int i = 0; i < scores.length; i++) {
            hallOfFame.add(scores[i]);

            if(hallOfFame.size() > k) hallOfFame.poll();

            answer[i] = hallOfFame.peek();
        }


        return answer;
    }
}