class Solution {
    public String solution(String my_string, int[] index_list) {
        
        char[] charArr = my_string.toCharArray();
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < index_list.length; i++) {
            sb.append(charArr[index_list[i]]);
        }
        
        String answer = sb.toString();
        return answer;
    }
}