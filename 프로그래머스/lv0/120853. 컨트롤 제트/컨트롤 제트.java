class Solution {
    public int solution(String s) {
        String[] strArr = s.split(" ");
        
        int answer = 0;
        for(int i = 0; i < strArr.length; i++) {
           
            if(strArr[i].equals("Z")) {
               answer -= Integer.valueOf(strArr[i - 1]);
            } else {
                answer += Integer.valueOf(strArr[i]);
            }
        }
        
        return answer;
    }
}