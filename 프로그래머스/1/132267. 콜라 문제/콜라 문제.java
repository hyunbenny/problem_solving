class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        
        while(n >= a){
            answer += n / a * b; // 바꿔온 병 개수
            n = (n / a * b) + (n % a); // 총 병 개수 = 바꿔온 병 개수 + 남은(못바꾼) 병 개수
        }
        
        
        return answer;
    }
}