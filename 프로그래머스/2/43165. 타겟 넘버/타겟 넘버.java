class Solution {
    int answer = 0; 

    public int solution(int[] numbers, int target) {
        findWays(numbers, 0, target, 0);
        return answer;
    }

    public void findWays(int[] numbers, int i, int target, int sum) {
        if (i == numbers.length) {
            if (sum == target) {
                answer++;
            }
            return;
        }
        findWays(numbers, i + 1, target, sum + numbers[i]);
        findWays(numbers, i + 1, target, sum - numbers[i]);
    }
}