import java.util.*;
class Solution {
    public int[] solution(int n) {
        
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1; i<=n;i++){
            if(i % 2 !=0){
                list.add(i);
            }
        }
        int[] answer = list.stream().mapToInt(x ->x).toArray();
        Arrays.sort(answer);
        return answer;
    }
}