import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        Integer [] numArr = new Integer[input.length()];

        for (int i = 0; i < input.length(); i++) {
            numArr[i] = Character.getNumericValue(input.charAt(i));
        }

        Arrays.sort(numArr, Comparator.reverseOrder());

        for (Integer i : numArr) {
            System.out.print(i);
        }

    }
}