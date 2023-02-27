class Solution {
    public int solution(int n) {
        
        int count = 0;
        int num = 1;
        while(num <= n) {
            count++;
            num *= count;
            System.out.println(count);
        }
        return count - 1;
    }
}