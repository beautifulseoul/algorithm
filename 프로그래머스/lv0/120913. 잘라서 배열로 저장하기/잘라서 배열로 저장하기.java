class Solution {
    public String[] solution(String my_str, int n) {
        int length = (int)Math.ceil((double)my_str.length()/n);
        
        String[] answer = new String[length];
        
        int num = 0;
        for(int i = 0; i < my_str.length(); i+=n) {
            if(num == length - 1) {
                answer[num] = my_str.substring(i);
            } else {
               answer[num] = my_str.substring(i, i + n); 
            }
            num++;
        }
        return answer;
    }
}