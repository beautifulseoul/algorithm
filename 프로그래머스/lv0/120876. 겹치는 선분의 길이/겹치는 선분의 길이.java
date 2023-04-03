import java.util.Set;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;

class Solution {
    public int solution(int[][] lines) {
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap();
        
        for(int i = 0; i < lines.length; i++) {
            for(int j = lines[i][0]; j < lines[i][1]; j++) {
                map.put(j, map.getOrDefault(j, 0) + 1);
            }
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