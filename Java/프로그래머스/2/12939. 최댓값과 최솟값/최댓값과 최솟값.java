class Solution {
    public String solution(String s) {
        String[] tmp = s.split(" ");
        int[] arr = new int[tmp.length];
        
        for(int i = 0 ; i < tmp.length ; i ++){
            arr[i] = Integer.parseInt(tmp[i]);
        }
        
        int max = arr[0];
        int min = arr[1];
        
        for(int num : arr){
            if(num > max) max = num;
            else if(num < min) min = num;
        }
        
        return min + " " + max;
    }
}