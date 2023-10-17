class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        
        for(int i = 0; i < s.length(); i++){
            int num = Character.getNumericValue(s.charAt(i));
            if((s.length() == 4 || s.length() == 6) && (num >= 0 && num <= 9)) continue;
            else {
                answer = false;
                break;
            }
        }
        
        return answer;
    }
}