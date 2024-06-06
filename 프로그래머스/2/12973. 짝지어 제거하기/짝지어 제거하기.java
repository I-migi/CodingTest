import java.util.*;
class Solution
{
    public int solution(String s)
    {
        Stack<Character> stack = new Stack<>();
        
        for(int i=0; i<s.length(); i++){
            char currentChar = s.charAt(i);
            
            if(!stack.isEmpty() && stack.peek() == currentChar){
                stack.pop();
            } else {
                stack.push(currentChar);
            }
        }
        int answer = stack.isEmpty() ? 1:0;


        return answer;
    }
}