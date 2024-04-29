class Solution {
    public int[] solution(int[] num_list) {
        int originArrLen = num_list.length;
        int[] answer = new int[originArrLen + 1];
            
        for(int i = 0; i <= originArrLen; i++) {
            if(i == originArrLen) {
               answer[i] = num_list[i - 1] > num_list[i - 2] ? 
                   num_list[i - 1] - num_list[i - 2] : num_list[i - 1] * 2;
                break;
            }
            answer[i] = num_list[i];
        }                
        return answer;
    }
}