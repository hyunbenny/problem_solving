import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        // 말할 수 있는 단어
        String[] words = {"aya", "ye", "woo", "ma"};

        // 단어와 치환할 숫자
        Map<String, String> wordMap = new HashMap<>();
        for (int i = 1; i <= words.length; i++) {
            wordMap.put(words[i-1], String.valueOf(i));
        }

        // 말할 수 있는 단어는 Map에 저장된 숫자로 치환
        for (int i = 0; i < babbling.length; i++) {
            String word = babbling[i];
            for (int j = 0; j < words.length; j++) {
                String target = words[j];
                word = word.replace(target, wordMap.get(target));
            }

            // word에 문자가 포함되어 있거나 같은 숫자가 연속으로 있으면 말할 수 없음
            String reg = "^[0-9]+";
            boolean isDuplicated = false;
            if (Pattern.matches(reg, word)) {
                for (int k = 0; k < word.length() -1; k++) {
                    if (word.charAt(k) == word.charAt(k + 1)) {
                        isDuplicated = true;
                    }
                }
                if(!isDuplicated) answer++;
            }
        }

        return answer;
    }
}