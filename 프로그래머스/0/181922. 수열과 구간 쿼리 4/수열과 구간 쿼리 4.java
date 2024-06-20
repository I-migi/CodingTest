import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        
        for(int i=0; i< queries.length; i++){
            for(int p = queries[i][0]; p<= queries[i][1]; p++){
                if(p % queries[i][2] ==0){
                    arr[p] = arr[p] +1;
                }
            }
        }
        int[] answer = Arrays.copyOf(arr,arr.length);
        return answer;
    }
}