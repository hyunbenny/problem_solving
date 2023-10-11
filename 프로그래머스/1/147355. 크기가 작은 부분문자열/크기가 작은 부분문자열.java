class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int pLength = p.length();
        
        for (int i = 0; i <= t.length() - pLength; i++) {
            long partedNum = Long.parseLong(t.substring(i, i + pLength));
            if (partedNum <= Long.parseLong(p)) answer++;
        }

        return answer;
    }
}