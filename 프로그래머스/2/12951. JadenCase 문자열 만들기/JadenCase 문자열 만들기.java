class Solution {
    public String solution(String s) {
        String answer = "";

        StringBuilder sb = new StringBuilder();
        String[] arr = s.toLowerCase().split(" ");

        for (String str : arr) {
            if(str.length() == 0){
                sb.append(" ");
                continue;
            }

            String head = str.substring(0, 1).toUpperCase();
            String tail = str.substring(1);
            sb.append(head).append(tail);

            sb.append(" ");
        }

        String lastLetter = s.substring(s.length() - 1);
        
        if (lastLetter.equals(" ")) return sb.toString();
        else return sb.toString().trim();    }
}