class Solution {
    public int[] solution(int n) {
        
        int arrLengthNum = (int)Math.round((double)n/2);
        int[] intArr = new int[arrLengthNum];
        // int[] intArr = new int[10];

        int count = 0;
        for(int i=1; i<= n; i+=2) {
            intArr[count] = i;
            count ++;            
        }
        
        return intArr;
    }
}