class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        for(int i = left; i <= right; i++){
            int count = getDivisorCount(i);
            if(count % 2 ==0){
                answer += i;
            }else{
                answer -= i;
            }
        }
        
        return answer;
    }
    
    private int getDivisorCount(int number){
        int result = 0;
        
        for(int i = 1; i <= number; i++){
            if(number % i == 0){
                result++;
            }
        }
        
        return result;
    }
}