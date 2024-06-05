public class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=1; i<=n; i++){
            if(isPrime(i)){
            answer = answer + 1;
        }
        }
        return answer;
    }
    
    public boolean isPrime(int a){
        if(a <= 1) return false;
        for(int i = 2; i*i <= a; i++){
            if(a % i == 0){
                return false;
            }
        }
        return true;
    }
}
