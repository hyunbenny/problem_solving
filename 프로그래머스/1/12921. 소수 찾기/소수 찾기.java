import java.util.*;

class Solution {
    public int solution(int n) {
        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = i;
        }

        for (int i = 2; i < Math.sqrt(n); i++) {
            if(arr[i] == 0) continue;
            for (int j = i + i; j < arr.length; j += i) {
                arr[j] = 0;
            }
        }

        List<Integer> list = new ArrayList<>();
        Arrays.stream(arr).filter(i -> i != 0).forEach(num -> list.add(num));

        return list.size() - 1; // 1은 포함되지 않음
    }
}