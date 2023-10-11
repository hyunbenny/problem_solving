import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        Map<String, Integer> mins = new HashMap<>();
        
        
         // keymap의 최소값 찾기
            for (int i = 0; i < keymap.length; i++) {
                String[] keys = keymap[i].split("");

                for (int j = 0; j < keys.length; j++) {
                    String key = keys[j];
                    if (!mins.containsKey(key) || mins.get(key) > j) {
                        mins.put(key, j + 1);
                    }
                }
            }

        
            int[] answer = new int[targets.length];
        
            for (int i = 0; i < targets.length; i++) {
                int count = 0;
                String[] target = targets[i].split("");

                for(int j = 0; j < target.length; j++){
                    String key = target[j];
                    if(!mins.containsKey(key)){
                        count = -1;
                        break;
                    }
                    
                    count += mins.get(key);
                }
                
                answer[i] = count;
            }
        
        return answer;
    }
}