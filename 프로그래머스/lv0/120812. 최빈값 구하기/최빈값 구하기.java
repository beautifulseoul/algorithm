import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;
import java.util.Iterator;

class Solution {
     public int solution(int[] array) {

        HashMap<Integer, Integer> map = new HashMap();
        for (int i : array) {
            int num = map.get(i) == null ? 1 : map.get(i) + 1;
            map.put(i, num);
        }

        int answer =0;
        int maxValueNum =0;
        for(int key : map.keySet()) {

            if(map.get(key) == maxValueNum) {
                answer=-1;
            } else {
                answer = map.get(key) > maxValueNum? key : answer;
                maxValueNum = map.get(key) > maxValueNum? map.get(key) : maxValueNum;
            }

        }

        return answer;
    }


}