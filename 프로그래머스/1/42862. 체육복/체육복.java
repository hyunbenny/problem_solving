import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int count = 0;
        
        Arrays.sort(lost);
        Arrays.sort(reserve);

        // 체육복을 가져온 애들 중 도난 당한 애 체크
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] == reserve[j]) {
                    count++;
                    lost[i] = -1;
                    reserve[j] = -1;
                    break;
                }
            }
        }

        // 비교해서 빌려주기
        for (int lostStudent : lost) {
            for (int i = 0; i < reserve.length; i++) {
                if (lostStudent == reserve[i] - 1 || lostStudent == reserve[i] + 1) {
                    reserve[i] = -1;
                    count++;
                    break;
                }
            }
        }
        
        return n - lost.length + count;
    }
}