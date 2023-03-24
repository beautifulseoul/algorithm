class Solution {
    public int solution(String my_string) {
        
        my_string = my_string.replaceAll("[a-zA-Z]", " ").trim();
        if(my_string.equals("")) {return 0;}
        
        
        String[] intArr = my_string.split(" +");
        
        int answer = 0;
        for(int i = 0; i < intArr.length; i++) {
            answer +=Integer.valueOf(intArr[i]);
        }
        
        return answer;
    }
}