class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        
        long budget = 0;
        for(int i = 1; i <= count; i++){
            budget += price * i;
        }
        
        if(budget <= money) answer = 0;
        else answer = budget - money;

        return answer;
    }
}