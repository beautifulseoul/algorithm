import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        List<Integer> intList = new ArrayList<>();
        
        for(int i = 2; i <= n; i++) {
            if(n % i == 0) {
                int count = 0;
                for(int j = 1; j < (int)Math.sqrt(i) + 1; j ++) {
                    count = (i % j == 0)? count + 1 : count; 
                }
                if(count == 1) {
                    intList.add(i);
                }
            }
        }

        int[] answer = new int[intList.size()];
        for(int i = 0; i < intList.size(); i++) {
            answer[i] = intList.get(i);
        }

        return answer;
    }
}