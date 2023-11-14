import java.time.LocalDate;

class Solution {
        public String solution(int a, int b) {
        String answer = "";

        String day = LocalDate.of(2016, a, b).getDayOfWeek().toString();

        return day.substring(0, 3);
    }
}