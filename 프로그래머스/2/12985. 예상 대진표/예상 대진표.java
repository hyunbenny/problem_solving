class Solution{
    public int solution(int n, int a, int b) {
        // 1  2   3  4   5  6   7  8
        //  1       2      3      4
        //      1             2

        // 홀수일 경우: / 2 + 1  하면 다음 라운드 번호
        // 짝수일 경우: / 2 하면 다음 라운드 번호
        int answer = 0;
        while (true) {
            a = (a / 2) + (a % 2);
            b = (b / 2) + (b % 2);

            answer++;
            if(a == b) break;
        }

        return answer;
    }
}