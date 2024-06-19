class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String kStr = Integer.toString(k);

        for (int p = i; p <= j; p++) {
            String ps = Integer.toString(p);

            for (int index = 0; index < ps.length(); index++) {
                if (ps.substring(index, index + 1).equals(kStr)) {
                    answer++;
                }
            }
        }

        return answer;
    }
}
