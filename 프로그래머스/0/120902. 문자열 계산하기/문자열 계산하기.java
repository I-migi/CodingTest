class Solution {
    public int solution(String my_string) {
        // 공백을 기준으로 문자열을 분할하여 숫자와 연산자를 추출
        String[] tokens = my_string.split(" ");
        
        // 첫 번째 숫자
        int result = Integer.parseInt(tokens[0]);
        
        // 연산자와 숫자를 번갈아가며 계산
        for (int i = 1; i < tokens.length; i += 2) {
            String operator = tokens[i];
            int operand = Integer.parseInt(tokens[i + 1]);
            
            if (operator.equals("+")) {
                result += operand;
            } else if (operator.equals("-")) {
                result -= operand;
            }
        }
        
        return result;
    }
}
