import java.util.HashMap;
import java.lang.Math;
class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0,0};
        HashMap<String,Integer> usedWords = new HashMap<String,Integer>();
        
        for(int i = 0; i < words.length ; i++){
            if(i == 0){
                usedWords.put(words[i],1);
                continue;
            }
            if(words[i].charAt(0) == words[i-1].charAt(words[i-1].length()-1) && usedWords.getOrDefault(words[i],-1) == -1){
                usedWords.put(words[i],1);
            }
            else{
                answer[0] = (i + 1) % n == 0 ? n : (i + 1) % n;
                answer[1] = (int) Math.ceil(Double.valueOf(i+1) / Double.valueOf(n));
                break;
            }
        }
        return answer;
    }
}