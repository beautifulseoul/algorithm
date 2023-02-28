class Solution {
    public int solution(int[] sides) {
        
        int sum = 0;
        int max = 0;
        for(int i = 0; i < 3; i++) {
            sum += sides[i];
            max = (max > sides[i])? max: sides[i];
        }
        
        int answer; 
        answer = (sum - max > max)? 1 : 2;   
        return answer;
    }
}