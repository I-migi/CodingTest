class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int minDifference = Integer.MAX_VALUE; // 초기값을 최대값으로 설정합니다.

        for (int i = 0; i < array.length; i++) {
            int currentDifference = Math.abs(array[i] - n);

            if (currentDifference < minDifference || (currentDifference == minDifference && array[i] < answer)) {
                minDifference = currentDifference;
                answer = array[i];
            }
        }

        return answer;
    }
}
