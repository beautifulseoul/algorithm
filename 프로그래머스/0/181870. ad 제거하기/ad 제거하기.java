class Solution {
    public String[] solution(String[] strArr) {
        int count = 0;
        for(int i = 0; i < strArr.length; i++) {
            if(strArr[i].contains("ad")) {
                strArr[i] = "";
                count++;
            }
        }
        
        int newArrCount = 0;
        String[] answer = new String[strArr.length - count];
        for(int i = 0; i < strArr.length; i++) {
            if(!strArr[i].equals("")) {
                answer[newArrCount] = strArr[i];
                newArrCount++;
                }
        }
        return answer;
    }
}