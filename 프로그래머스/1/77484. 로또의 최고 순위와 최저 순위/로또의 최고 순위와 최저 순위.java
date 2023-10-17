import java.util.Arrays;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer;

        int[] filteredZeros = Arrays.stream(lottos).filter(n -> n != 0).sorted().toArray();
        Arrays.sort(win_nums);

        int zeroCount = lottos.length - filteredZeros.length;
        int count = 0;

        for (int i = 0; i < filteredZeros.length; i++) {
            for (int j = 0; j < win_nums.length; j++) {
                if (filteredZeros[i] == win_nums[j]) {
                    count++;
                    break;
                }
            }
        }

        int max = calRank(count + zeroCount);
        int min = calRank(count);
        answer = new int[]{max, min};
        return answer;
    }

    private int calRank(int num) {

        if(num == 6) return 1;
        else if(num == 5) return 2;
        else if(num == 4) return 3;
        else if(num == 3) return 4;
        else if(num == 2) return 5;
        else return 6;

    }
}