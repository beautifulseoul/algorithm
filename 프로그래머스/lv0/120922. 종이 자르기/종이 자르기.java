class Solution {
    public int solution(int M, int N) {
        int max = Math.max(M, N);
        int min = Math.min(M, N);
        
        int answer = (max - 1) + (max * (min - 1));
        return answer;
    }
}