import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        
        char[] charArr = my_string.toCharArray();  
        String[] st = new String[my_string.length()];
        
        for(int i = 0; i < my_string.length(); i++) {
            st[i] =(charArr[i] + "").toLowerCase();
        }
        Arrays.sort(st);
        
        return String.join("", st);
    }
}