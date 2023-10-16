class Solution {
    public boolean solution(int x) {
        boolean answer = true;

        int sumOfNums = 0;
        String num = String.valueOf(x);

        for(int i = 0; i < num.length(); i++){
            sumOfNums += Character.getNumericValue(num.charAt(i));
        }

        answer = x % sumOfNums == 0 ? true : false;

        return answer;
    }
}