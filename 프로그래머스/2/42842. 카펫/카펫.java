class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];

        int total = brown + yellow;

        // 가로 >= 세로
        for (int i = 1; i <= total; i++) {
            if (total % i == 0) {
                int row = i;
                int col = total / row;

                if(row > col) continue;

                int yellowBlock = (row - 2) * (col - 2);
                if (yellowBlock == yellow) {
                    answer[0] = col;
                    answer[1] = row;
                    break;
                }
            }
        }

        return answer;
    }
}