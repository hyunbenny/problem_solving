class Solution {
    public String solution(String phone_number) {
        int endIdx = phone_number.length() - 4;

        StringBuilder answer = new StringBuilder();
        for(int i = 0; i < endIdx; i++){
            answer.append("*");
        }

        answer.append(phone_number.substring(endIdx));

        return answer.toString();
    }
}