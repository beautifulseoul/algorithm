class Solution {
    public String solution(String s) {

        String answer = "";
            if(s.length() % 2==0) {
                 //짝수일 때
                 answer=s.substring(s.length()/2-1, s.length()/2+1);
            } else{
                //홀수일 때
                answer=s.substring(s.length()/2, s.length()/2+1);       
        } return answer;
    }
}