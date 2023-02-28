class Solution {
    public String solution(String my_string) {
        
        char[] charArr = my_string.toCharArray();
        
        for(int i = 0; i < charArr.length; i++) {
            for(int j = 0; j < i; j ++) {
                if((charArr[i] + "").equals(charArr[j] + "")) {
                    charArr[i] = '0';
                }
            }
        }
    
        return String.valueOf(charArr).replaceAll("0", "");
    }
}