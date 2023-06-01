class Solution {
    public int solution(int[][] sizes) {

        int shorterSide = 0;
        int longerSide = 0;

        for(int i = 0; i < sizes.length; i++) {
            if(sizes[i][0] > sizes[i][1]) {
                // sizes[i][0] 이 더 긴 변
                if(shorterSide < sizes[i][1]) shorterSide = sizes[i][1];
                if(longerSide < sizes[i][0]) longerSide = sizes[i][0];    
            } else {
                // sizes[i][1] 이 더 긴 변
                if(shorterSide < sizes[i][0]) shorterSide = sizes[i][0];
                if(longerSide < sizes[i][1]) longerSide = sizes[i][1];   
            }
        }
        return shorterSide * longerSide;
    }
}