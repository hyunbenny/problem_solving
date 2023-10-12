class Solution {
    public int solution(int[] numbers) {
        int answer = 0;

        int[] countArr = new int[10];
        for(int i = 0; i < numbers.length; i++){
            int number = numbers[i];
            int count = countArr[number];
            countArr[number] = count + 1;
        }

        for(int i = 0; i < countArr.length; i++){
            if(countArr[i] == 0) answer += i;
        }

        return answer;
    }
}