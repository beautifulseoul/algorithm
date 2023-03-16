class Solution {
    public String[] solution(String my_str, int n) {
        int length = (int)Math.ceil((double)my_str.length()/n);
        String[] answer = new String[length];

        for(int i = 0; i < length; i++) {
            if(i == length - 1) {
                answer[i] = my_str.substring(i * n);
            } else {
               answer[i] = my_str.substring(i * n, n * (i + 1) ); 
            }
            
        }
        return answer;
    }
}