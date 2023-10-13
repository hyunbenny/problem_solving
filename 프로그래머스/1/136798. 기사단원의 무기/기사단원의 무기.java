class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;

        // 약수를 구하고
        for(int i = 1; i <= number; i++){
            int count = getDivisorCount(i);

            // 약수의 개수가 limit보다 크면 power로 값을 바꿔서 더해준다.
            if(count > limit) answer += power;
            else answer += count;
        }

        return answer;
    }

    private int getDivisorCount(int n){
        int count = 0;

        for(int i = 1; i <= Math.sqrt(n); i++){
            if(Math.pow(i, 2) == n) count++;
            else if(n % i == 0) count += 2;
        }

        return count;
    }
}