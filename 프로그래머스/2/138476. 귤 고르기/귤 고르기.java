import java.util.*;

public class Solution {
    public int solution(int k, int[] tangerine) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int e : tangerine) {
            map.put(e, map.getOrDefault(e, 0) + 1);
        }

        List<Integer> index = new ArrayList<>();
        
        for (int e : map.values()) {
            index.add(e);
        }
        
        Collections.sort(index, Collections.reverseOrder());
        
        int i = 0;
        int sum = 0;
        
        for (i = 0; i < index.size(); i++) {
            sum += index.get(i);
            if (sum >= k) break;
        }
        
        return i + 1;
    }
}