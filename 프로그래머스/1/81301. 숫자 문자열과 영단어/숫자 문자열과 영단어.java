import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(String s) {
        int answer = 0;

        Map<String, Integer> mapping = makeTable();
        for(String word : mapping.keySet()){
            if(s.contains(word)) s = s.replaceAll(word, String.valueOf(mapping.get(word)));
        }

        return Integer.parseInt(s);
    }
    
    private Map<String, Integer> makeTable(){
        Map<String, Integer> table = new HashMap<>();
        table.put("zero", 0);
        table.put("one", 1);
        table.put("two", 2);
        table.put("three", 3);
        table.put("four", 4);
        table.put("five", 5);
        table.put("six", 6);
        table.put("seven", 7);
        table.put("eight", 8);
        table.put("nine", 9);
        return table;
    }
}