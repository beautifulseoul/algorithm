class Solution {
    public int solution(int balls, int share) {
        
//         balls = 30;
//         share = 15;
        
        int limitNum = (balls - share > share)? balls - share : share;
        
        long denom = 1;
        for(int i = balls - limitNum; i >= 1 ; i--) {
            denom *= i;
        } 
        
        long numer = 1;
        for(int i = balls; i > limitNum; i--) {
            numer *= i;
            if((numer % 2 == 0) && (denom % 2 == 0)) {
                denom = denom / 2;
                numer = numer / 2;
            }
        } 
        

                
        return (int)(numer / denom);
    }
}