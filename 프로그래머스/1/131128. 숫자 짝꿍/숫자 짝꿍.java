import java.util.*;

class Solution {
   public String solution(String X, String Y) {
        int[] Xcount = new int[10];

        for(int i = 0; i < X.length(); i++){
            int index = Character.getNumericValue(X.charAt(i));
            int count = Xcount[index];
            Xcount[index] = ++count;
        }

        // 저장한 X 값과 비교하여 answer에 값 저장
        List<Integer> tmpList = new ArrayList<>();
        for(int i = 0; i < Y.length(); i++){
            int index = Character.getNumericValue(Y.charAt(i));
            int xcount = Xcount[index];
            if(xcount == 0) continue;

            tmpList.add(index);
            Xcount[index] = --xcount;
        }

        // 저장한 값을 역순으로 정렬하면 가장 큰 정수
        StringBuilder sb = new StringBuilder();
        tmpList.stream().sorted((n1, n2) -> n2 - n1).forEach(n -> {
            sb.append(n);
        } );

        String answer = "";
        if(sb.toString().startsWith("0")) answer = "0";
        else if (sb.toString().equals("")) answer = "-1";
        else answer = sb.toString();

        return answer;
    }
}