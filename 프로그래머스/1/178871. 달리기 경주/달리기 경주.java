import java.util.HashMap;
import java.util.Map;

class Solution {
    private static Map<String, Integer> rank = new HashMap<>();
    
    public String[] solution(String[] players, String[] callings) {

        for (int i = 0; i < players.length; i++) {
            rank.put(players[i], i);
        }

        for (String calling : callings) {
            Integer index = rank.get(calling);
            players = swap(players, index);
        }

        String[] answer = players;
        return answer;
    }

    private String[] swap(String[] players, int index) {
        String ahead = players[index - 1];
        String behind = players[index];

        if (index != 0) {
            players[index - 1] = behind;
            players[index] = ahead;
        }

        updateRank(ahead, index);
        updateRank(behind, index-1);

        return players;
    }

    private void updateRank(String player, Integer updateRank) {
        rank.put(player, updateRank);
    }
}