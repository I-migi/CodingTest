import java.util.ArrayList;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i< nums.length; i++){
           if(!list.contains(nums[i])){
               list.add(nums[i]);
           }
        }
        if(list.size() > nums.length /2){
            answer = nums.length/2;
        }else{
            answer = list.size();
        }

        return answer;
    }
}