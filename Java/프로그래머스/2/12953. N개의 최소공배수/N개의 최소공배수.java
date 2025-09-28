import java.util.HashMap;
import java.util.Map;

public class Solution {
    public long solution(int[] arr) {
        Map<Integer, Integer> primePowers = new HashMap<>();
        
        for (int value : arr) {
            if (value < 2) {
                continue;
            }
            
            int num = value;
            for (int j = 2; j < 100; j++) {
                int cnt = 0;
                while (num % j == 0) {
                    num /= j;
                    cnt++;
                }
                primePowers.put(j, Math.max(primePowers.getOrDefault(j, 0), cnt));
                if (num == 1) {
                    break;
                }
            }
        }
        
        long sum = 1;
        for (int prime : primePowers.keySet()) {
            sum *= Math.pow(prime, primePowers.get(prime));
        }
        
        return sum;
    }
}