import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        
        Queue<String> q1 = makeQueue(cards1);
        Queue<String> q2 = makeQueue(cards2);
        
        for(int i = 0; i < goal.length; i++){
            String str = goal[i];
            if(!q1.isEmpty() && q1.peek().equals(str)){
                q1.poll();
            } else if(!q2.isEmpty() && q2.peek().equals(str)){
                q2.poll();
            } else{
                return "No";
            }
        }
        
        String answer = "Yes";
        return answer;
    }
    
    private Queue<String> makeQueue(String[] cards){
        Queue<String> q = new LinkedList<>();
        
        for(String card : cards){
            q.offer(card);
        }
        
        return q;
    }
}