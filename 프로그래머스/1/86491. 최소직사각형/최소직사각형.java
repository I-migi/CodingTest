import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        ArrayList<Integer> widmaxs = new ArrayList<>();
        ArrayList<Integer> heimaxs = new ArrayList<>();
        for(int i=0; i< sizes.length; i++){
            int widmax =0;
                int heimax = 1000;
            for(int p=0; p<2; p++){
                
                if(sizes[i][p] > widmax){
                    widmax = sizes[i][p];
                }
                if(sizes[i][p] <heimax){
                    heimax = sizes[i][p];
                }
            }
            widmaxs.add(widmax);
            heimaxs.add(heimax);
        }
        
        int maxwidth = Collections.max(widmaxs);
        int maxheight = Collections.max(heimaxs);
        

        answer = maxwidth * maxheight;
        return answer;
    }
}