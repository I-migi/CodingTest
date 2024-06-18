import java.util.*;
class Solution {
    public int solution(int[] box, int n) {
        ArrayList<Integer> list = new ArrayList<>();
        int answer = 1;
        for(int i=0; i<box.length;i++){
            list.add(box[i] / n);
        }
        for(int j=0; j<3; j++){
            answer = answer * list.get(j);
        }
        return answer;
    }
}