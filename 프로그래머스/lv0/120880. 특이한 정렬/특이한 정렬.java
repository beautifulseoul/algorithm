import java.util.HashMap;
import java.util.Arrays;

    class Solution {
    public int[] solution(int[] numlist, int n) {
        HashMap<Double, Integer> hmap = new HashMap<>();

        for(int i = 0; i < numlist.length; i++) {
            if(numlist[i] - n >= 0) {
                hmap.put(numlist[i] - n + 0.0, numlist[i]);
            } else {
                hmap.put(-numlist[i] + n + 0.1, numlist[i]);
            }
        }

        Object[] mapKey = hmap.keySet().toArray();
        Arrays.sort(mapKey);

        int[] answer = new int[numlist.length];
        for(int i = 0; i < numlist.length; i++) {
            answer[i] = hmap.get(mapKey[i]);
        }
        return answer;
    }
}