import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) throws ParseException{
        List<Integer> answer = new ArrayList<>();
        
        Map<String, Integer> termsMap = new HashMap<>();
        for(int i = 0; i < terms.length; i++){
            String[] termInfo = terms[i].split(" ");
            termsMap.put(termInfo[0], Integer.parseInt(termInfo[1]));
        }
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
        Date todayDate = sdf.parse(today);
        
        Calendar cal = Calendar.getInstance();
        
        for(int i = 0; i < privacies.length; i++){
            String[] privacyInfo = privacies[i].split(" ");
                
            // 개인정보 수집일로부터 유효기간 계산
            cal.setTime(sdf.parse(privacyInfo[0]));
            
            Integer duration = termsMap.get(privacyInfo[1]);
            cal.add(Calendar.MONTH, duration);           
            
            Date expireDate = cal.getTime();
            
            // 비교
            if (expireDate.before(todayDate) || expireDate.equals(todayDate)) answer.add(i + 1);

        }

        return answer.stream().mapToInt(n -> n).toArray();
    }
}