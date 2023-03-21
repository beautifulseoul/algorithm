class Solution {
    public int solution(int[][] dots) {
        
        int xMax = dots[0][0];
        int xMin = dots[0][0];
        int yMax = dots[0][1];
        int yMin = dots[0][1];
        
        for(int i = 0; i < 4; i++) {
            xMax = Math.max(dots[i][0], xMax);
            xMin = Math.min(dots[i][0], xMin);
            yMax = Math.max(dots[i][1], yMax);
            yMin = Math.min(dots[i][1], yMin);
        }
        
        return Math.abs(xMax - xMin) * Math.abs(yMax - yMin);
    }
}