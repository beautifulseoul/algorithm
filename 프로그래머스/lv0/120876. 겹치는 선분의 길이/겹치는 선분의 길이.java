import java.util.Set;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;

class Solution {
    public int solution(int[][] lines) {
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap();
        
        // 첫번째 선분
        for(int i = lines[0][0]; i < lines[0][1]; i++) {
            map.put(i, 1);
        }
        
        // 두번째 선분
        for(int i = lines[1][0]; i < lines[1][1]; i++) {
            if(map.get(i) == null) { map.put(i, 1); }
            else { map.put(i, map.get(i) + 1); }
        }
        
        // 세번째 선분
        for(int i = lines[2][0]; i < lines[2][1]; i++) {
            if(map.get(i) == null) { map.put(i, 1); }
            else { map.put(i, map.get(i) + 1); }
        }

        Set s = map.entrySet();
        Iterator it = s.iterator();

        while(it.hasNext()){
            Map.Entry e = (Map.Entry)it.next();            
            if((int)e.getValue() != 1) count++;
        }

        return count;
    }
}