class Solution {
    public double solution(int[] numbers) {
        
        int totalNum = 0;
        for(int num : numbers) {
            totalNum += num;
        }
        
        return (double)totalNum / numbers.length;
    }
}