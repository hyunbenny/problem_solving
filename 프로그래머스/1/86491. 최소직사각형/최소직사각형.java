import java.util.*;

class Solution {
    public int solution(int[][] sizes) {        
        int[] maxs = new int[sizes.length];
        int[] mins = new int[sizes.length];
        
        for(int i = 0; i < sizes.length; i++){
            int[] arr = sizes[i];
            maxs[i] = Math.max(arr[0], arr[1]);
            mins[i] = Math.min(arr[0], arr[1]);
        }
        
        int max = Arrays.stream(maxs).max().getAsInt();
        int min = Arrays.stream(mins).max().getAsInt();
        
        return max * min;
    }
}