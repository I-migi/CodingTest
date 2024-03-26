class Solution {
    public int solution(int n) {
        
        int answer = 0;
        
        // x가 주어졌어 그리고 x+1 x+2 .. 더하면 n이 되어야 하는거잖아 이게 가능한 x의 수를 구하면 되는 문제
        
        for(int i=1; i<=n; i++){
            int sum = 0;
            
                for(int j=i; j<=n; j++){
                    sum = sum + j;
                     if(sum == n){
                    answer ++ ;  
                         break;
                } else if(sum >n){
                         break;
                     } 
                } 
            
        }
        return answer;
    }
}