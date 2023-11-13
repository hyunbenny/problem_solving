class Solution {
      public int solution(int n) {
        int answer = 0;

        int bitCount = Integer.bitCount(n);
        int i = 1;
        while (true) {
            int num = n + i;
            if (bitCount == Integer.bitCount(n + i)) {
                answer = num;
                break;
            } else {
                i++;
            }
        }

        return answer;
    }
}