class Solution {
        public int solution(String s) {
        int answer = 0;

        char ch = s.charAt(0);
        int same = 0;
        int diff = 0;

        for(int i = 0; i < s.length(); i++){
            if(same == diff){
                answer++;
                ch = s.charAt(i);
            }

            if(ch == s.charAt(i)) same++;
            else diff++;
        }

        return answer;
    }
}