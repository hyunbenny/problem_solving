class Solution {
    public int solution(int n) {

        // 0 1 1 2 3 5 8 13 21 34 55 89 144 ...
        int[] dy = new int[n + 1];
        dy[0] = 0;
        dy[1] = 1;
        for (int i = 2; i <= n; i++) {
            dy[i] = (dy[i - 1] % 1234567) + (dy[i - 2]  % 1234567)  % 1234567;
        }

        return dy[n] % 1234567;
    }
}