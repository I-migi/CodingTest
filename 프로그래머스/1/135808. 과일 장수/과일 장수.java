import java.util.Arrays;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);
        
        // 가능한 최대 점수의 상자를 만들어서 이익을 계산
        int maxBoxes = score.length / m;
        for (int i = 1; i <= maxBoxes; i++) {
            int boxPrice = score[score.length - i * m]; // 현재 상자의 최저 점수
            answer += boxPrice * m; // 상자 가격 계산
        }
        
        return answer;
    }
}
