class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int rows = arr1.length;
        int cols = arr1[0].length;
        int[][] answer = new int[rows][cols];
        
        for(int i=0; i<arr1.length;i++){
            for(int p=0; p<arr1[i].length;p++){
                answer[i][p] = arr1[i][p] + arr2[i][p];
            }
        }
        
        
        return answer;
    }
}