import java.util.*;                                                        
class Solution {
    public int[] solution(String my_string) {
        ArrayList<Integer> list = new ArrayList<>();
        char[] charlist = my_string.toCharArray();
        for(char a : charlist){
            if(Character.isDigit(a)){
                list.add(Character.getNumericValue(a));
            }
        }
        Collections.sort(list);
        
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}