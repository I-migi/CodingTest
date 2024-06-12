import java.util.*;
class Solution {
    public String solution(String my_string, int num1, int num2) {
        
        char a = my_string.charAt(num1);
        char b = my_string.charAt(num2);
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<my_string.length();i++){
            if(i == num1){
                sb.append(b);
            }else if(i == num2){
                sb.append(a);
            }else{
                sb.append(my_string.charAt(i));
            }
        }
        String answer = sb.toString();
        return answer;
    }
}