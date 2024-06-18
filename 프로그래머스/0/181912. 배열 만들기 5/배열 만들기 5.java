import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        int ind = s+l;
        for(int i=0; i<intStrs.length; i++){
            list.add(Integer.parseInt(intStrs[i].substring(s,ind)));
        }
        
        for(int j=0; j<list.size();j++){
            if(list.get(j) > k){
                list2.add(list.get(j));
            }
        }
        
        
        int[] answer = new int[list2.size()];
        for(int p=0; p<list2.size();p++){
            answer[p] = list2.get(p);
        }
        
        System.out.println(list);
        System.out.println(list2);
        return answer;
    }
}