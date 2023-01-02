class Solution {
    public long solution(long n) {

       long answer = 0;

            if ((int) Math.sqrt(n) == Math.sqrt(n)) {
                answer = (long)((Math.sqrt(n) + 1) * (Math.sqrt(n) + 1));
            } else {
                answer = -1;
            }
        return answer;
        
    }
}