class Solution {
    boolean solution(String s) {
        int leftCount = 0;
        int rightCount = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                leftCount++; 
            } else if (c == ')') {
                rightCount++; 
            }
            if (rightCount > leftCount) {
                return false;
            }
        }
        return leftCount == rightCount;
    }
}
