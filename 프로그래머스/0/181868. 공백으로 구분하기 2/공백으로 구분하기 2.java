class Solution {
    public String[] solution(String my_string) {
        String[] strArr = my_string.split(" ");
        
        int count = 0;
        for(String str : strArr) {
            if(str.equals("")) {
                count++;
            }
            
        }
        
        int answerIdx = 0;
        String[] answer = new String[strArr.length - count];
        for(int i = 0; i < strArr.length; i++) {
            if(!strArr[i].equals("")) {
                answer[answerIdx] = strArr[i];
                answerIdx++;
            }
        }
        
        return answer;
    }
}