class Solution {
    public int solution(int num, int k) {
        String numstring = Integer.toString(num);
        String kstring = Integer.toString(k);
        char kchar = kstring.charAt(0);
        int answer = -1;
        if(numstring.contains(kstring)){
            for(int i=0; i<numstring.length();i++){
                if(numstring.charAt(i) == kchar){
                    answer = i+1;
                    break;
                }
            }
        }
        System.out.print(numstring);
        
        return answer;
    }
}