class Solution {
    public String solution(int[] food) {
        String answer = "";
        int n = food.length;
        StringBuilder sb = new StringBuilder();
        StringBuilder bs = new StringBuilder();
        for(int i=1; i<n;i++){
            String str = Integer.toString(i);
            sb.append(str.repeat(food[i] / 2));
        }

        answer = sb.toString();
        bs = sb.reverse();
        bs.insert(0,"0");
        answer = answer + bs;

        return answer;
    }
}