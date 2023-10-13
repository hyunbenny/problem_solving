import java.util.*;

class Solution {
    public int solution(String[] babbling) {
        int answer = 0;

        String[] speakWords = {"aya", "ye", "woo", "ma"};
        String[] cannotSpeakWords = {"ayaaya", "yeye", "woowoo", "mama"};

        for(int i = 0; i < babbling.length; i++){
            String word = babbling[i];
            for(int j = 0; j < speakWords.length; j++){
                if(word.contains(cannotSpeakWords[j])) continue;
                word = word.replace(speakWords[j], " ");
            }

            if(word.trim().length() == 0) answer++;
        }

        return answer;
    }
}