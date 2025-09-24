class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = {0,0};
        int sum = brown + yellow;
        int width,height = 0;
        for(int i = 1 ; i < sum ; i ++){
            width = i;
            height = sum / i ;
            if((width - 2) * ( height - 2 ) == yellow){
                if(width < height){
                    answer[0] = height;
                    answer[1] = width;
                }
                else{
                    answer[0] = width;
                    answer[1] = height;
                }
            }
        }
        return answer;
    }
}