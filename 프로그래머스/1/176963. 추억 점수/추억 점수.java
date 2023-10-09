import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
         Map<String, Integer> yearnings = new HashMap<>();
        for (int i = 0; i < name.length; i++) {
            yearnings.put(name[i], yearning[i]);
        }

        int[] answer = new int[photo.length];
        for (int i = 0; i < photo.length; i++) {
            int total = 0;

            String[] p = photo[i];
            for (String n : p) {
                Integer y = yearnings.get(n);
                total += y == null ? 0 : y;
            }

            answer[i] = total;
        }

        return answer;
    }
}