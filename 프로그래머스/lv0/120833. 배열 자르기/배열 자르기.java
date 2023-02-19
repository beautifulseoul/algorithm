class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        
        int[] intArr = new int[num2 - num1 + 1];
        
        for(int i = num1, j = 0; i <= num2; i++, j++){
            intArr[j] = numbers[i];
            
        }
        
        return intArr;
    }
}