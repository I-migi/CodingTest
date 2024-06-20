import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] tokens = s.split(" ");
        ArrayList<Integer> list = new ArrayList<>();
        
        for (String token : tokens) {
            if (token.equals("Z")) {
                if (!list.isEmpty()) {
                    list.remove(list.size() - 1);
                }
            } else {
                    int number = Integer.parseInt(token);
                    list.add(number);
            }
        }
        
        for (int num : list) {
            answer += num;
        }
        
        return answer;
    }
}
