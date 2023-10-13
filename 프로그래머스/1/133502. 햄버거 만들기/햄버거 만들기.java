import java.util.*;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;

        Stack<Integer> stack = new Stack<>();
        for (int i : ingredient) {
            stack.push(i);

            if (stack.size() >= 4) {
                if (canMakeHamburger(stack)) {
                    removeIngredient(stack);
                    answer++;
                }
            }
        }

        return answer;
    }

    private boolean canMakeHamburger(Stack<Integer> stack) {
        boolean answer = false;
        int idx = stack.size();
        if (stack.get(idx - 4) == 1 && stack.get(idx - 3) == 2 && 
            stack.get(idx - 2) == 3 && stack.get(idx - 1) == 1){
            answer = true;
        }            
        
        return answer;
    }

    private Stack removeIngredient(Stack stack) {
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        return stack;
    }
}