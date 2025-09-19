class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = 1 ; i <= n ; i ++){
            int result = 0;
            for(int j = 0 ; i + j <= n ; j++){
                result += i + j;
                if(result > n) break;
                if(result == n) answer++;
            }
        }
        return answer;
    }
}