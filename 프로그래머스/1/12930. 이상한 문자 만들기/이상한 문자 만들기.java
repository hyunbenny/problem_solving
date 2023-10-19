class Solution {
       public String solution(String s) {
        String[] split = s.split("");
        StringBuilder sb = new StringBuilder();
        
        int count = 0;
        for (int i = 0; i < split.length; i++) {
            if (split[i].isBlank()) {
                sb.append(" ");
                count = 0;
            } else {
                if(count % 2 == 0) sb.append(split[i].toUpperCase());
                else sb.append(split[i].toLowerCase());
                count++;
            }
        }

        return sb.toString();
    }
}