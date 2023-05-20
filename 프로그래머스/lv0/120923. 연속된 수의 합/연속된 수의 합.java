class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        
        for(int i = 0; i < num; i++) {
            answer[i] = (int)Math.ceil(total * 1.0 / num) - num / 2 + i;
        }
        
        return answer;
    }
}