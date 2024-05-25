import java.util.ArrayList;
class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        ArrayList<Integer> num = new ArrayList<>();
        for(int i=0; i<signs.length;i++){
            if(signs[i]){
                num.add(absolutes[i]);
            }
            else{
                num.add(-absolutes[i]);
            }
        }
        for(int n:num){
            answer = answer + n;
        }
        return answer;
    }
}