class Solution {
    public int solution(int n) {
        int answer = 0;
        int binaryNCount = 0;
        
        binaryNCount = getOneCount(n);
        
        while(true){
            n++;
            if(binaryNCount == getOneCount(n)) break;
        }
        
        return n;
    }
    
     public static int getOneCount(int num){
            String binary = Integer.toString(num,2);
            int binaryCount = 0;
            for(int i = 0 ; i < binary.length() ; i ++)
            {
                if(binary.charAt(i) == '1') binaryCount ++;
            }
            return binaryCount;
        }
}