
class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;

        int n = d.length;
        for(int i=0; i< n-1; i++){
            for(int j=0; j<n-1; j++){
                if(d[j] > d[j +1]){
                    int temp = d[j];
                    d[j] = d[j+1];
                    d[j+1] = temp;
                }
            }
        }
        for(int i=0; i<n; i++){
            
            if(budget >= d[i]){
                budget = budget - d[i];
                answer ++;
            }else{
                break;
            }
        }
        
        return answer;
    }
}