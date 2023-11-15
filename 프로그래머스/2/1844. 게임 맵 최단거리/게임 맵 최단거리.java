import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    private static int[][] direction = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    private static int[][] distance;
    private static boolean[][] visit;
    private static int N, M;


    public int solution(int[][] maps) {
        int answer = 0;

        N = maps.length;
        M = maps[0].length;
        visit = new boolean[N][M];
        distance = new int[N][M];
        bfs(maps, 0, 0);

        answer = distance[N - 1][M - 1];
        return answer == 0 ? -1 : answer;
    }

    private void bfs(int[][] maps, int x, int y) {
        Queue<Integer> q = new LinkedList<>();
        q.add(x);
        q.add(y);
        visit[x][y] = true;
        distance[x][y] = 1;

        while (!q.isEmpty()) {
            x = q.poll();
            y = q.poll();

            for (int k = 0; k < 4; k++) {
                int newX = x + direction[k][0];
                int newY = y + direction[k][1];

                if (newX < 0 || newY < 0 || newX >= N || newY >= M) continue;
                if(maps[newX][newY] == 0) continue;
                if(visit[newX][newY]) continue;

                q.add(newX);
                q.add(newY);
                visit[newX][newY] = true;
                distance[newX][newY] = distance[x][y] + 1;
            }
        }



    }

}
