class Solution {
    public int solution(int balls, int share) {
        
        int num = Math.min(balls - share, share);
        long result = 1;
        
        for(int i = 0; i < num; i++) {
            result = result * (balls - i);
            result = result / (i + 1);
        }
        
        return (int) result;
    }
}