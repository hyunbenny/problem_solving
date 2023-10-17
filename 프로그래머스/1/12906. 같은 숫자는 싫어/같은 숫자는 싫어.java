import java.util.*;

public class Solution {
     public int[] solution(int []arr) {

        int startIdx = 0;
        int endIdx = startIdx + 1;


        List<Integer> list = new ArrayList<>();
        while(startIdx < arr.length){
            if(endIdx < arr.length && arr[startIdx] == arr[endIdx]){
                endIdx++;
            }else{
                list.add(arr[startIdx]);
                startIdx = endIdx;
                endIdx = startIdx + 1;
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}