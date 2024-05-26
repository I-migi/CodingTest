import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        // Check if the input array is empty or has a single element
        if (arr == null || arr.length == 0) {
            return new int[0];
        }
        
        // Use ArrayList to dynamically handle elements
        ArrayList<Integer> list = new ArrayList<>();
        
        // Add the first element to the list
        list.add(arr[0]);
        
        // Loop through the array starting from the second element
        for (int i = 1; i < arr.length; i++) {
            // If the current element is not the same as the previous, add it to the list
            if (arr[i] != arr[i - 1]) {
                list.add(arr[i]);
            }
        }
        
        // Convert the ArrayList back to an array
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] input = {1, 1, 3, 3, 0, 1, 1};
        int[] result = sol.solution(input);
        System.out.println(Arrays.toString(result)); // Expected output: [1, 3, 0, 1]
    }
}
