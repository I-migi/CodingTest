import java.util.*;
class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0; i<section.length;i++){
            if(!list.contains(section[i])){
                for(int p=section[i]; p<section[i]+m; p++){
                    list.add(p);
                }
                answer ++;
            }
        }
        
        
        return answer;
    }
}