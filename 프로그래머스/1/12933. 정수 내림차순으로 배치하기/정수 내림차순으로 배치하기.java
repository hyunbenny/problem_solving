import java.util.*;

class Solution {
    public long solution(long n) {
                String[] nums = String.valueOf(n).split("");
        Arrays.sort(nums, Collections.reverseOrder());

        StringBuilder sb = new StringBuilder();
        Arrays.stream(nums).forEach(i -> sb.append(i));

        return Long.parseLong(sb.toString());
    }
}