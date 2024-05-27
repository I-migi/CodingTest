class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        char[] ch = new char[s.length()];
        
        for(int i=0; i<s.length(); i++){
            ch[i] = s.charAt(i);
        }
        if(s.length() !=4 && s.length() !=6){
            answer = false;
        }else{      
        for(char c:ch){
            if(Character.isLetter(c)){
                answer = false;
                break;
            }
        }
        }

        return answer;
    }
}