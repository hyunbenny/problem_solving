import java.util.*;

public class Solution {
      public int[] solution(int n, String[] words) {
        int[] answer = new int[]{0, 0};

        Map<String, Boolean> usedWordMap = new HashMap<>();
        char lastLetterOfLastWord = words[0].charAt(words[0].length() - 1);
        usedWordMap.put(words[0], true);

        for (int i = 1; i < words.length; i++) {
            String word = words[i];
            if (lastLetterOfLastWord != word.charAt(0) || usedWordMap.containsKey(word)) {
                answer = new int[]{(i % n) + 1, (i / n) + 1};
                break;
            } else {
                usedWordMap.put(words[i], true);
                lastLetterOfLastWord = word.charAt(word.length() - 1);
            }

        }

        return answer;
    }
}
