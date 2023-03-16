class Solution {
    public String[] solution(String my_str, int n) {
        int length = (int)Math.ceil((double)my_str.length()/n);
        String[] answer = new String[length];

        for(int i = 0; i < length; i++) {
            answer[i] = (i == length - 1)? my_str.substring(i * n) : my_str.substring(i * n, n * (i + 1) ); 
        }
        return answer;
    }
}