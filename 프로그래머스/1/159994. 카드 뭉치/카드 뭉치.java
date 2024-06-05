import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList(cards1));
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList(cards2));
        
        for(int i=0; i<goal.length; i++){
            if(!list1.isEmpty() && list1.get(0).equals(goal[i])){
                list1.remove(0);
            }else if(!list2.isEmpty() && list2.get(0).equals(goal[i])){
                list2.remove(0);
            }else{
                answer = "No";
                break;
            }
        }

        return answer;
    }
}