import java.util.*;
class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        List<String> list = Arrays.asList("aya","ye","woo","ma");
        
        for(String n:babbling){
            String originalWord = n;
            for(String listword:list){
                n = n.replace(listword," ");
            }
            if(n.trim().isEmpty()){
                answer ++;
            }
        }
        
        return answer;
    }
}