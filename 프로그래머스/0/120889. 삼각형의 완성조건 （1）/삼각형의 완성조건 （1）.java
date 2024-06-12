class Solution {
    public int solution(int[] sides) {
        int sum =0;
        int max =0;
        for(int i=0; i<3; i++){
            if(sides[i] > max){
                max = sides[i];
            }
            sum = sum + sides[i];
        }
        int answer;
        if(sum > max*2){
            answer = 1;
        }else{
            answer =2;
        }
        
        return answer;
    }
}