import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    private static List<Integer>[] graph;
    private static boolean[] visit;

    private static StringBuilder sb = new StringBuilder();


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        graph = new ArrayList[N + 1];

        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());

            int node1 = Integer.parseInt(st.nextToken());
            int node2 = Integer.parseInt(st.nextToken());
            graph[node1].add(node2);
            graph[node2].add(node1);
        }

        for (int i = 1; i <= N; i++) {
            Collections.sort(graph[i]);
        }


        visit = new boolean[graph.length];
        dfs(V);
        System.out.println(sb.toString());

        sb.setLength(0);
        visit = new boolean[graph.length];
        bfs(graph, V);
        System.out.println(sb.toString());
    }

    private static void dfs(int start) {

        visit[start] = true;
        sb.append(start).append(" ");

        for (Integer node : graph[start]) {
            if (!visit[node]) {
                dfs(node);
            }
        }

    }

    private static void bfs(List<Integer>[] graph, int start) {
        Queue<Integer> q = new LinkedList<>();

        q.offer(start);
        visit[start] = true;

        while (!q.isEmpty()) {
            int node = q.poll();
            sb.append(node).append(" ");

            for (int i = 0; i < graph[node].size(); i++) {
                int tmp = graph[node].get(i);
                if (!visit[tmp]) {
                    q.offer(tmp);
                    visit[tmp] = true;
                }
            }
        }
    }
}
