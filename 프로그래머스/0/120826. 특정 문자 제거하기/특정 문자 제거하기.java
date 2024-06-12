class Solution {
    public String solution(String my_string, String letter) {
         
        String answer =my_string.replace(letter,"");
        System.out.print(my_string);
        return answer;
    }
}