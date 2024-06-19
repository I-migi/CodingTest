import java.util.*;

class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        Map<Character, Integer> charCount = new HashMap<>();

       
        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // 빈도가 1인 문자를 리스트에 추가합니다.
        List<Character> uniqueChars = new ArrayList<>();
        for (char c : charCount.keySet()) {
            if (charCount.get(c) == 1) {
                uniqueChars.add(c);
            }
        }

        // 리스트를 정렬합니다.
        Collections.sort(uniqueChars);

        // 정렬된 문자를 StringBuilder에 추가합니다.
        for (char c : uniqueChars) {
            sb.append(c);
        }

        // 최종 결과를 문자열로 변환하여 반환합니다.
        return sb.toString();
    }
}
