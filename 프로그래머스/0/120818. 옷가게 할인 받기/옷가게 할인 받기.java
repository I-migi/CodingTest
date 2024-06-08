class Solution {
    public int solution(int price) {
        int answer = 0;
        
        if (price >= 500000) {
            price *= 0.8; // 20% 할인
        } else if (price >= 300000) {
            price *= 0.9; // 10% 할인
        } else if (price >= 100000) {
            price *= 0.95; // 5000원 할인
        }
        
        answer = price;
        return answer;
    }
}
