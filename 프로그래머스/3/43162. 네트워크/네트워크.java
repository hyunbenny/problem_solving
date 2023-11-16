class Solution {
    private static boolean[] visit;
    private static int count;
    
    public int solution(int n, int[][] computers) {
        visit = new boolean[computers.length];

        for (int i = 0; i < computers.length; i++) {
            if(!visit[i]){
                dfs(computers, i);
                count++;
            }
        }

        return count;
    }

    private static void dfs(int[][] computers, int index) {
        visit[index] = true;

        for (int i = 0; i < computers.length; i++) {
            if (!visit[i] && computers[index][i] == 1) {
                dfs(computers, i);
            }
        }
    }
}