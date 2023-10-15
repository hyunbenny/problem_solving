import java.util.*;
import java.lang.*;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                sb.append("*");
            }
            sb.append("\n");
        }        
        
        System.out.print(sb.toString());
    }
}