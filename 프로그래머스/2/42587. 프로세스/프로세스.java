import java.util.Collections;
import java.util.PriorityQueue;

public class Solution {
    public int solution(int[] priorities, int location) {

        int answer = 0;

        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        for (int i : priorities) {
            q.add(i);
        }

        while (!q.isEmpty()) {
            for (int i = 0; i < priorities.length; i++) {
                if (priorities[i] == q.peek()) {
                    q.poll();
                    answer++;
                    if(i == location) return answer;
                }
            }
        }

        return answer;
    }
}
