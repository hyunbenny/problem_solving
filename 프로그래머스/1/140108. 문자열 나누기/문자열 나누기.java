class Solution {
        public int solution(String s) {
        int answer = 0;

        char ch = s.charAt(0);
        int same = 0;
        int diff = 0;

        for (int i = 0; i < s.length(); i++) {
            if(ch == s.charAt(i)) same++;
            else diff++;

            if (same == diff) {
                answer++;
                same = 0;
                diff = 0;

                if(i + 1 < s.length()){
                    ch = s.charAt(i + 1);
                }

            } else if (i + 1 == s.length()) {
                answer++;
            }
        }

        return answer;
    }
}