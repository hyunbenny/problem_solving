import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;

        long sqrt = (long) Math.sqrt(n);

        if(Math.pow(sqrt, 2) == n){
            sqrt = sqrt + 1;
            answer = (long) Math.pow(sqrt, 2);
        }else{
            answer = -1;
        }

        return answer;
    }
}