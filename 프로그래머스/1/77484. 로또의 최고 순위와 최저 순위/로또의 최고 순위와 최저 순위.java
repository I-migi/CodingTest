import java.util.*;
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        Integer[] lottosIntegerArray = Arrays.stream(lottos).boxed().toArray(Integer[]::new);
        List<Integer> list = new ArrayList<>(Arrays.asList(lottosIntegerArray));
        int count =0;
        for(int i=0; i<win_nums.length;i++){
            if(list.contains(win_nums[i])){
                System.out.println(win_nums[i]);
                count++;
            }
        }
        int zero = Collections.frequency(list,0);
        int count2 = zero + count;
        int minlotto = -1;
        int maxlotto = -1;
        switch(count){
            case 2:
                minlotto = 5;
                break;
            case 3:
                minlotto = 4;
                break;
            case 4:
                minlotto = 3;
                break;
            case 5:
                minlotto = 2;
                break;
            case 6:
                minlotto =1;
                break;
            default:
                minlotto = 6;
                break;
        }
        
                switch(count2){
            case 2:
                maxlotto = 5;
                break;
            case 3:
                maxlotto = 4;
                break;
            case 4:
                maxlotto = 3;
                break;
            case 5:
                maxlotto = 2;
                break;
            case 6:
                maxlotto =1;
                break;
            default:
                maxlotto = 6;
                break;
        }
            
       answer[0] = maxlotto;
        answer[1] = minlotto;
        return answer;
    }
}