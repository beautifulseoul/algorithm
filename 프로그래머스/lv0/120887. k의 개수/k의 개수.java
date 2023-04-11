class Solution {
    public int solution(int i, int j, int k) {
        
        int count = 0;
        
        for(int m = i; m <= j; m++) {
            int num = m;
            while(num != 0) {
                if(num % 10 == k) {
                    count++;
                }
                num /= 10;
            }
        }
        
        return count;
    }
}