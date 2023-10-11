import java.util.Arrays;

class Solution {
   public String solution(String s, String skip, int index) {
        String answer = "";

        // a-z: 97 - 122
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            for (int j = 0; j < index; j++) {
                // 더하고
                ch++;

                // 더한 값이 skip에 있는지 확인하는데 123 인 경우 -> 97이 되어야 함.
                if(ch > 'z') ch -= 26;

                // 있으면 카운트를 줄여줘야 함.
                if (skip.contains(String.valueOf(ch))) j--;
            }
            answer += ch;
        }

        return answer;
    }
}