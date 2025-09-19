class Solution {
    boolean solution(String s) {
        String[] arr = s.split("");
        int sum = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i].equals("(")) sum ++;
            else sum --;    
            if(sum < 0) return false;
        }
        return sum == 0 ? true : false;
    }
}