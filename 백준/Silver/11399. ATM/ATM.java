import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] people = new int[N + 1];


        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 1; i < people.length; i++) {
            people[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(people);

        int[] sum = new int[N + 1];
        for (int i = 1; i < people.length; i++) {
            sum[i] = sum[i - 1] + people[i];
        }

        System.out.println(Arrays.stream(sum).sum());
    }
}