class Solution {
    public int[] solution(String s) {
        int[] answer = {0,0};
        int zeroCount = 0;
        int changeCount = 0;
        while(s.length() > 1){
            StringBuilder newS = new StringBuilder();
            for(int i = 0 ; i < s.length(); i++){
                char ch = s.charAt(i);
                if(ch == '0') zeroCount ++;
                else newS.append('1');
            }
            s = Integer.toString(newS.toString().length(),2);
            changeCount ++;
        }
        answer[0] = changeCount;
        answer[1] = zeroCount;
        return answer;
    }
}