class Solution {
    public int solution(int n) {
        
        int count = 0;
        
        for(int i = 1; i < (int)Math.sqrt(n) + 1 ; i++){
            if(n % i == 0) {
                count = (i * i == n)? count + 1 : count + 2;   
            }            
        }
        
        return count;
    }
}