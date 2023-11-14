import java.util.Stack;

class Solution {
           public int solution(String s) {
        int answer = 0;

        if(s.length() == 1) return answer;

        for (int i = 0; i < s.length(); i++) {
            if(isCorrect(s)) answer++;
            s = changePosition(s);
        }

        return answer;
    }

    private String changePosition(String s) {
        String tail = s.substring(0, 1);
        String head = s.substring(1);

        return head + tail;
    }

    private boolean isCorrect(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!stack.isEmpty()) {
                if (ch == '(' || ch == '{' || ch == '[') {
                    stack.push(ch);
                    continue;
                }

                if (ch == ')' && stack.peek() == '(') {
                    stack.pop();
                } else if (ch == '}' && stack.peek() == '{') {
                    stack.pop();
                } else if (ch == ']' && stack.peek() == '[') {
                    stack.pop();
                }

            } else {
                stack.push(ch);
            }
        }

        return stack.isEmpty() ? true : false;
    }
}