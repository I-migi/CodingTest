class Solution {
    public int[] solution(int[] num_list) {
        int hol =0;
        int zza =0;
        for (int num : num_list){
            if(num % 2 ==0){
                zza++;
            }else{
                hol++;
            }
        }
        int[] answer = new int[2];
        answer[0] = zza;
        answer[1] = hol;
        return answer;
    }
}