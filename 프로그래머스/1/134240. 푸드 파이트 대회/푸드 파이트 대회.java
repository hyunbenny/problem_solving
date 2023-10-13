class Solution {
    public String solution(int[] food) {
        String answer = "";
        
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i < food.length; i++){
            int foodNum = food[i];                    
            for(int j = 0; j < foodNum / 2; j++){
                sb.append(i);
            }            
        }
        
        answer += sb.toString() + "0" + sb.reverse();
        
        return answer;
    }
}