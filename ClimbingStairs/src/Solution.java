import java.util.HashMap;
import java.util.Map;

public class Solution {
    int climbStairs(int n) {
        if (n < 1) { return 0; }
        if (n == 1) { return 1; }
        if (n == 2) { return 2; }

        Map<Integer, Integer> memo = new HashMap<>();
        memo.put(0,0);
        memo.put(1,1);
        memo.put(2,2);

        for(int i = 3; i <= n; i++) {
            memo.put(i, memo.get(i-2) + memo.get(i-1));
        }

        return memo.get(n);
    }
}
