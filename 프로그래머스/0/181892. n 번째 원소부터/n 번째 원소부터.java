import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list, int n) {
        // 다른사람 풀이보고 Arrays.copyOfRange()로 푼 것
        int[] answer = Arrays.copyOfRange(num_list, n - 1, num_list.length);
        return answer;
        
        // 원래 썼던 코드
        // int count = num_list.length - n + 1;
        // int[] answer = new int[count];
        // for(int i = 0; i < count; i++) {
        //     answer[i] = num_list[n - 1 + i];
        // }
        // return answer;
    }
}