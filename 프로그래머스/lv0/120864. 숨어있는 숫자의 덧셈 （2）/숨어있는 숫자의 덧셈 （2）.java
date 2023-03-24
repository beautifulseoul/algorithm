class Solution {
    public int solution(String my_string) {
        
        String[] strArr = my_string.replaceAll("[a-zA-Z]", " ").split(" ");
                
        int answer = 0;
        for(String str : strArr) {
            if(!str.equals("")) {
                answer +=Integer.valueOf(str);
            }
        }
        
        return answer;
    }
}