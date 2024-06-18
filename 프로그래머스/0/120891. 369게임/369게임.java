class Solution {
    public int solution(int order) {
        int answer = 0;
        String str = Integer.toString(order);
        char[] charArray = str.toCharArray();
        for(char c : charArray){
            if(c == '3' ||c == '6' ||c == '9'){
                answer++;
            }
        }
        return answer;
    }
}