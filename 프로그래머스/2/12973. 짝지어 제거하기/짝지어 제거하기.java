import java.util.Stack;

class Solution {
    public int solution(String s){
        int answer;

        Stack<String> stack = new Stack<>();
        String[] arr = s.split("");
        
        if(s.length() == 0) return 0;

        for (int i = 0; i < arr.length; i++) {
            if (!stack.isEmpty() && stack.peek().equals(arr[i])) {
                stack.pop();
            } else {
                stack.push(arr[i]);
            }
        }

        answer = stack.isEmpty() ? 1 : 0;

        return answer;
    }
}