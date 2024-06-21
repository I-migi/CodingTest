import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> stk = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            if(stk.isEmpty()){
                stk.add(arr[i]);
            }else if(stk.get(stk.size()-1) == arr[i]){
                stk.remove(stk.size()-1);
            }else{
                stk.add(arr[i]);
            }
        }
        int[] answer;
        if(stk.isEmpty()){
            answer = new int[]{-1};
        }else{
            answer = new int[stk.size()];
            for(int i=0; i<stk.size(); i++){
                answer[i] = stk.get(i);
            }
        }
        
        return answer;
    }
}