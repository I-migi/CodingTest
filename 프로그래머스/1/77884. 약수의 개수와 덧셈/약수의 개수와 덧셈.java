class Solution {
    
    public int cnt(int num){
        int count =0;
        for(int i=1; i<=num; i++){
            if(num % i ==0){
                count++;
            }
        }
        return count;
    }
    
    public int solution(int left, int right) {
        int answer = 0;
        for(int k=left; k<=right; k++){
            if(cnt(k) % 2 == 0){
                answer = answer + k;
            }else{
                answer = answer - k;
            }
        }
        
        return answer;
    }
}