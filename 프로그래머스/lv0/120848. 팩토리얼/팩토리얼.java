class Solution {
    public int solution(int n) {
        
        int count = 0;
        int fac = 1;
        while(fac <= n) {
            count++;
            fac *= count;
        }
        return count - 1;
    }
}