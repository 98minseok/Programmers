import java.util.*;

public class Solution {
    public int solution(int n) {
        String str = Integer.toString(n,2);
        int answer = 0;
        
        for(int i = 0 ; i < str.length() ; i++){
            if(str.charAt(i) == '1') answer ++;
        }
        
        return answer;
    }
}