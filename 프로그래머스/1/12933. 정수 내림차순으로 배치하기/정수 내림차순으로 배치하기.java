import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;

        char[] nums = String.valueOf(n).toCharArray();
        List<Integer> numList = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            numList.add(Character.getNumericValue(nums[i]));
        }

        StringBuilder sb = new StringBuilder();
        numList.stream().sorted((o1, o2) -> {
            return o2 - o1;
        }).mapToInt(Integer::intValue).forEach(i -> sb.append(i));

        return Long.parseLong(sb.toString());
    }
}