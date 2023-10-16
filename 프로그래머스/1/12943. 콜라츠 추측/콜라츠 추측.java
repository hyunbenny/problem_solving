class Solution {
    public int solution(int num) {
        int answer = 0;
        
        if(num == 1) return 0;
        
        long parsedNum = (long) num;
        while(parsedNum != 1){
            if(parsedNum % 2 == 0) parsedNum = parsedNum / 2;
            else parsedNum = parsedNum * 3 + 1;
            
            answer++;
        }
        
        if(answer >= 500) answer = -1;
        
        return answer;
    }
}