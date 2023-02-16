class Solution {
    public String solution(String my_string) {
        
        char[] charArr = my_string.toCharArray();
        char[] reverseArr = new char[charArr.length];
        
        for (int i = 0; i < charArr.length ; i++) {
            reverseArr[charArr.length - i - 1] = charArr[i];            
        }
        
        return String.valueOf(reverseArr);
    }
}