class Solution {
    public int[] solution(long n) {
        String num = String.valueOf(n);
        int[] answer = new int[num.length()];
        
        int lastIdx = num.length() - 1;
        for(int i = lastIdx; i >= 0; i--){
            answer[lastIdx - i] = Character.getNumericValue(num.charAt(i));
        }
        
        return answer;
    }
}