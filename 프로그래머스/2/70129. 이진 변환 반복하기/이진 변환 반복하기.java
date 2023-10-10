class Solution {
       public int[] solution(String s) {

        int count = 0;
        int removedZero = 0;
        while (!s.equals("1")) {
            count++;
            String replaced = s.replaceAll("0", "");
            removedZero += s.length() - replaced.length();
            s = Integer.toBinaryString(replaced.length()).toString();
        }

        int[] answer = {count, removedZero};
        return answer;
    }
}