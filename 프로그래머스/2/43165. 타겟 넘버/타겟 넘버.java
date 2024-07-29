class Solution {
    int answer = 0; 

    public int solution(int[] nums, int tgt) {
        findWays(nums, 0, tgt, 0);
        return answer;
    }

    public void findWays(int[] nums, int idx, int tgt, int sum) {
        if (idx == nums.length) {
            if (sum == tgt) {
                answer++;
            }
            return;
        }
        findWays(nums, idx + 1, tgt, sum + nums[idx]);
        findWays(nums, idx + 1, tgt, sum - nums[idx]);
    }
}
