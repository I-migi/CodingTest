class Solution {
    public int[] solution(int n, int m) {
        int[] answer = {};
        int k=0;
        int p=0;
        for(int i = n>m?n:m; i>0;i--){
            if(n % i ==0 && m%i==0){
                k=i;
                break;
            }
        }
        for(int q = n>m?n:m; ;q++){
            if(q % n ==0 && q%m==0){
                p=q;
                break;
            }
        }
        answer = new int[]{k,p};

        return answer;
    }
}