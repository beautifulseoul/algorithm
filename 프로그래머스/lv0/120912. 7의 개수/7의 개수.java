class Solution {
    public int solution(int[] array) {
        
        int num = 0;
        int count = 0;
        for(int i = 0; i < array.length; i++) {
                num = array[i];
                while(num != 0) {
                     if(num % 10 == 7) {
                         count++;
                     }
                    num /= 10;
                } 
        }

        return count;
    }
}