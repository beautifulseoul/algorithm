import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {

        int min = arr[0];
        int count = 0;
        int index = 0;
        int[] answer;

        for (int i = 0; i < arr.length; i++) {
            min = (arr[i] < min) ? arr[i] : min;
        }

        for (int i = 0; i < arr.length; i++) {
            count = (min == arr[i]) ? count + 1 : count;
        }

        if (!(count == arr.length)) {
            answer = new int[arr.length - count];
            for (int i = 0; i < arr.length; i++) {

                if (!(arr[i] == min)) {
                    answer[index] = arr[i];
                    index++;
                }
            }
        } else {
            answer = new int[]{-1};
        }  
        return answer;
    }
}