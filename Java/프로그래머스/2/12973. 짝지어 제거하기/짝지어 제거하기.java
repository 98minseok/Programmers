import java.util.Stack;

class Solution
{
    public int solution(String s)
    {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length() ; i ++){
            if(!stack.isEmpty()){
                if(s.charAt(i) == stack.peek()){
                    stack.pop();
                }
                else{
                    stack.push(s.charAt(i));
                }
            }
            else{
                stack.push(s.charAt(i));
            }
        }
        return stack.size() == 0 ? 1 : 0;
        
    }
}