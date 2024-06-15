import java.util.*;

class Solution {
    public int[] solution(int[] numbers, String direction) {
        
        ArrayList<Integer> list = new ArrayList<>();
        if(direction.equals("left")){
            for(int i=0; i< numbers.length; i++){
                if(i==numbers.length-1){
                    list.add(numbers[0]);
                }else{
                    list.add(numbers[i+1]);
                }
            }
        }else{
            for(int i=0; i<numbers.length; i++){
                if(i == 0){
                    list.add(numbers[numbers.length-1]);
                }else{
                    list.add(numbers[i-1]);
                }
            }
        }
        System.out.print(list);
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}