class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        
        int startIdx = Math.min(a, b);
        int endIdx = Math.max(a, b);
        
        for(int i = startIdx; i <= endIdx; i++){
            answer += i;
        }
        
        return answer;
    }
}
