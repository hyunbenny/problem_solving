import java.util.*;

class Solution {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] want = {"banana", "apple", "rice", "pork", "pot"};
        int[] number = {3, 2, 2, 2, 1};
        String[] discount = {"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"};

        int result = sol.solution(want, number, discount);
        System.out.println("result = " + result);
    }

    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;

        Map<String, Integer> wishMap = new HashMap<>();
        for (int i = 0; i < want.length; i++) {
            wishMap.put(want[i], number[i]);
        }

        Map<String, Integer> count = new HashMap<>();
        // 첫번째 날부터 10까지
        for (int i = 0; i < 10; i++) count.put(discount[i], count.getOrDefault(discount[i], 0) + 1);
        if(check(wishMap, count)) answer++;

        // 두번째 날부터
        for (int i = 1; i <= discount.length - 10; i++) {
            // 이전 날짜의 상품 하나 제거
            String priorProduct = discount[i - 1];
            count.put(priorProduct, count.get(priorProduct) - 1);

            // 새로운 상품 추가
            String newProduct = discount[i - 1 + 10];
            count.put(newProduct, count.getOrDefault(newProduct, 0) + 1);

            if (check(wishMap, count)) answer++;
        }

        return answer;
    }

    private static boolean check(Map<String, Integer> wishMap, Map<String, Integer> count) {
        // 내가 원하는 수량과 비교
        for (String key : wishMap.keySet()) {
            if (!count.containsKey(key) || count.get(key) != wishMap.get(key)) {
                return false;
            }
        }

        return true;
    }
}