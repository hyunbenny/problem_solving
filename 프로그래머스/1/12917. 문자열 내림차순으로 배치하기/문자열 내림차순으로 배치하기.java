import java.util.*;

class Solution {
    public String solution(String s) {

        String[] split = s.split("");
        Arrays.sort(split, Collections.reverseOrder());

        StringBuilder answer = new StringBuilder();
        Arrays.stream(split).forEach(n -> answer.append(n));

        return answer.toString();
    }
}