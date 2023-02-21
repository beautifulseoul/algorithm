import java.util.Arrays;

class Solution {
      public int[] solution(int[] emergency) {

        int[] copyArr = Arrays.copyOf(emergency, emergency.length);
        Arrays.sort(emergency);
        
        for(int i = 0; i < emergency.length; i++) {
            for(int j =0; j < emergency.length; j++) {
                if(copyArr[i] == emergency[j]) {
                    copyArr[i] = emergency.length - j;
                    break;
                }
            }
        }
          
        return copyArr;
    }
}