class Solution {
    boolean solution(String s) {
        boolean answer = false;
        int pCount = 0;
        int yCount = 0;
        
        s = s.toLowerCase();
        
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'p') pCount++;
            else if(s.charAt(i) == 'y') yCount++;
        }
        
        if(pCount == yCount) answer = true;
        else if(pCount == 0 && yCount == 0) answer = true;

        return answer;
    }
}