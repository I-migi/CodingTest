class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int sum =0;
        int p = x;
            sum = sum + x/1000;
            x= x % 1000;
            sum = sum + x/100;
            x = x%100;
            sum = sum + x/10;
            x = x %10;
            sum = sum + x;
        System.out.println(sum);
        if(p % sum !=0){
            answer = false;
        }
            return answer;
        }
        
    }
