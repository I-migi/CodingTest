import java.util.ArrayList;

class Solution {
    public String[] solution(String my_str, int n) {
        ArrayList<String> list = new ArrayList<>();
        int start = 0;
        
        while (start < my_str.length()) {
            int end = Math.min(start + n, my_str.length());
            list.add(my_str.substring(start, end));
            start += n;
        }
        
        // ArrayList를 배열로 변환
        String[] answer = new String[list.size()];
        return list.toArray(answer);
    }
}
