import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;

class Solution {
    public int solution(int[] sides) {
        
        Arrays.sort(sides);
        Set set = new HashSet();
        
        // 가장 짧은 변
        for(int i = 1 ; i <= sides[0]; i++) {
            if(i > sides[1] - sides[0]) {
            set.add(i);
            }
        }
        
        // 중간길이 변        
        for(int i = sides[0]; i <= sides[1]; i++) {
            if(i > sides[1] - sides[0]) {
                set.add(i);
            }
        }
        
        // 가장 긴 변
        for(int i = sides[1]; i < sides[0] + sides[1] ; i++) {
            set.add(i);
        }
        
        return set.size();
    }
}