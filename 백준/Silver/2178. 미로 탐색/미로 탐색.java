import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    private static int N, M, COUNT;
    private static String[] graph;
    private static boolean[][] visit;
    private static int[][] distance; // 갈 수 있으면 값이 들어가고, 갈 수 없는 경우 -1
    private static int[][] direction = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        graph = new String[N];
        visit = new boolean[N][M];
        distance = new int[N][M];

        for (int i = 0; i < N; i++) {
            graph[i] = br.readLine();
        }

        bfs(0, 0);
        System.out.println(distance[N - 1][M - 1]);
    }

    private static void bfs(int x, int y) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                distance[i][j] = -1;
            }
        }

        Queue<Integer> q = new LinkedList<>();
        q.add(x);
        q.add(y);

        distance[x][y] = 1;
        visit[x][y] = true;

        while (!q.isEmpty()) {
            x = q.poll();
            y = q.poll();

            for (int k = 0; k < 4; k++) {
                int newX = x + direction[k][0];
                int newY = y + direction[k][1];

                if(newX < 0 || newY < 0 || newX >= N || newY >= M) continue;
                if(graph[newX].charAt(newY) == '0') continue;
                if(visit[newX][newY]) continue;

                q.add(newX);
                q.add(newY);
                visit[newX][newY] = true;
                distance[newX][newY] = distance[x][y] + 1;
            }
        }
    }

}
