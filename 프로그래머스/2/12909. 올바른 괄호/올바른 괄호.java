import java.util.Stack;

class Solution {
         boolean solution(String s) {
        boolean answer = false;
        
        if(s.startsWith(")")) return false;

        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++){
           if(!stack.isEmpty() && s.charAt(i) == ')') stack.pop();
           else stack.push(s.charAt(i));
        }

        if(stack.isEmpty()) answer = true;
        return answer;
    }
}