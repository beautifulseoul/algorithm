class Solution {
    public int solution(int[] numbers, int k) {
        
        int num = (2 * k - 1) % numbers.length;
        num = (num == 0)? numbers.length : num;
    
        return numbers[num - 1];
    }
}