import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public int[] solution(String my_string) {

        char[] charArr = my_string.toCharArray();
        List<Integer> arrList = new ArrayList<>();

        for(int i = 0; i < my_string.length(); i++) {
            if('0' <= charArr[i] && charArr[i] <= '9') {
                arrList.add(charArr[i] - '0');
            }
        }

        int[] intArr = new int[arrList.size()];
        for(int i = 0; i < arrList.size(); i++) {
            intArr[i] = arrList.get(i);
        }
        Arrays.sort(intArr);
        return intArr;
    }
}