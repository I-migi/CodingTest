import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0; i<score.length;i++){
            list.add(score[i]);
            if(list.size() <= k){
                answer[i] = Collections.min(list);
            }else{
                Collections.sort(list);
                answer[i] = list.get(list.size() - k);
            }
        }
        return answer;
    }
}