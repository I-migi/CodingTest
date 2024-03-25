class Solution {
    boolean solution(String s) {
        int leftCount = 0;
        int rightCount = 0;

        // 문자열을 순회하면서 괄호의 개수를 센다
        for (char c : s.toCharArray()) {
            if (c == '(') {
                leftCount++; // 왼쪽 괄호 개수 증가
            } else if (c == ')') {
                rightCount++; // 오른쪽 괄호 개수 증가
            }

            // 오른쪽 괄호 개수가 왼쪽 괄호 개수보다 많아지면 올바른 괄호가 아님
            if (rightCount > leftCount) {
                return false;
            }
        }

        // 마지막으로 왼쪽 괄호와 오른쪽 괄호의 개수가 같은지 비교하여 반환
        return leftCount == rightCount;
    }
}
