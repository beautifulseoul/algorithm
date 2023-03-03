import java.util.Arrays;

class Solution {
    public int solution(int[] array, int n) {
             
        Arrays.sort(array);
        
        int min = array[0] - n;
        int answer = array[0];
    
       
        for(int i = 0; i < array.length; i++) {
            if(Math.abs(array[i] - n) < Math.abs(min)) {
                // if((Math.abs(array[i] - n) == Math.abs(min)) && ((array[i] - n) > min)) {
                //      continue;
                // }
                min = array[i] - n;
                answer = array[i];
            }
        }
        return answer;
    }
}