import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    private static StringBuilder sb = new StringBuilder();
    private static int N, groupCount;
    private static String[] a;
    private static int[][] direction = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
    private static boolean[][] visit;
    private static List<Integer> group;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        a = new String[N];

        for (int i = 0; i < N; i++) {
            a[i] = br.readLine();
        }
        visit = new boolean[N][N];

        process();
    }

    private static void process() {
        group = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!visit[i][j] && a[i].charAt(j) == '1') {
                    groupCount = 0;
                    dfs(i, j);
                    group.add(groupCount);
                }
            }
        }

        Collections.sort(group);
        sb.append(group.size()).append("\n");
        for(int count : group) sb.append(count).append("\n");
        System.out.println(sb.toString());
    }

    private static void dfs(int x, int y) {
        groupCount++;
        visit[x][y] = true;

        for (int k = 0; k < 4; k++) {
            int newX = x + direction[k][0];
            int newY = y + direction[k][1];

            if(newX < 0 || newY < 0 || newX >= N || newY >= N) continue;
            if(a[newX].charAt(newY) == '0') continue;
            if(visit[newX][newY]) continue;
            dfs(newX, newY);
        }

    }
}
