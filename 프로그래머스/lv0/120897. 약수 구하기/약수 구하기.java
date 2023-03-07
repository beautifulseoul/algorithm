import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;

class Solution {
    public int[] solution(int n) {

        Set set = new HashSet();
        for(int i = 1; i < (int)Math.sqrt(n) + 1; i++) {
            if(n % i == 0){
                set.add(i);
                set.add(n/i);
            }
        }       
        
        int count = 0;
        int[] intArr = new int[set.size()];
        for(Object num : set.toArray()) {
            intArr[count] = (int)num;
            count++;
        }
           
        Arrays.sort(intArr);
        return intArr;
    }
}