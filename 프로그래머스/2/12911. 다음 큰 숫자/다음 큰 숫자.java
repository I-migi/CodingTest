class Solution {
    public int solution(int n) {
        int answer = 0;
        String binaryN = Integer.toBinaryString(n);
        int Ncount = 0;
        

        for (int i = 0; i < binaryN.length(); i++) {
            if (binaryN.charAt(i) == '1') {
                Ncount++;
            }
        }
            

        for (int i = n + 1; ; i++) {
            String binaryI = Integer.toBinaryString(i);
            int Icount = 0;
            

            for (int j = 0; j < binaryI.length(); j++) {
                if (binaryI.charAt(j) == '1') {
                    Icount++;
                }
            }
            

            if (Icount == Ncount) {
                answer = i;
                break;
            }
        }
        
        return answer;
    }
}
