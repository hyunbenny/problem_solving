class Solution {
    public String solution(String s) {
        String answer = "";
        
        int length = s.length();
        int centerIdx = s.length() / 2;
        
        if(length % 2 == 0){
            answer = s.substring(centerIdx -1 , centerIdx + 1);
        } 
        else{
            answer = String.valueOf(s.charAt(centerIdx));
        
        } 
        
        return answer;
    }
}