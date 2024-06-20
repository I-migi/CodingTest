import java.util.*;

class Solution {
    public int solution(int[] arr) {
        List<int[]> history = new ArrayList<>();
        history.add(arr.clone()); // 초기 배열 상태 저장
        
        while (true) {
            int[] current = history.get(history.size() - 1).clone();
            boolean changed = false;

            for (int i = 0; i < current.length; i++) {
                if (current[i] >= 50 && current[i] % 2 == 0) {
                    current[i] /= 2;
                } else if (current[i] < 50 && current[i] % 2 == 1) {
                    current[i] = current[i] * 2 + 1;
                }
            }

            for (int[] prev : history) {
                if (Arrays.equals(prev, current)) {
                    return history.size() - 1;
                }
            }

            history.add(current);
        }
    }
}
