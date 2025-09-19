class Solution {
    public String solution(String s) {
        String arr[] = s.split(" ",-1);
        String answer = "";
        for(int i = 0 ; i < arr.length ; i ++)
        {
            if(arr[i].length() == 0) continue;
            arr[i] = arr[i].substring(0,1).toUpperCase() + arr[i].substring(1).toLowerCase();
            
        }
        
        return String.join(" ",arr);
    }
}