import java.util.*;

class Solution {
    public String solution(String my_string) {
        
        String string = my_string.toLowerCase();
        char[] charArray = string.toCharArray();
        Arrays.sort(charArray);
        String answer = new String(charArray);
        return answer;
    }
}