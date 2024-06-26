class Solution {
    public String[] solution(String[] names) {
         int num = names.length % 5 == 0 ? names.length / 5 : names.length / 5 + 1;
         String[] answer = new String[num];
        
        for(int i = 0, j = 0; i < names.length; i += 5, j++) {
            answer[j] = names[i];
        }
        
        return answer;
    }
}