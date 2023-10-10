import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String[][] memberInfo = new String[N][2];

        for (int i = 0; i < N; i++) {
            String[] info = br.readLine().split(" ");
            memberInfo[i][0] = info[0];
            memberInfo[i][1] = info[1];

        }

        Arrays.sort(memberInfo, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
            }
        });

        for (int i = 0; i < N; i++) {
            System.out.println(memberInfo[i][0] + " " + memberInfo[i][1]);
        }
    }
}