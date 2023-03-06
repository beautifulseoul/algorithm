class Solution {
    public String solution(String my_string, int num1, int num2) {
        
        char ch = my_string.charAt(num1);
        
        char[] charArr = my_string.toCharArray();
        charArr[num1] = charArr[num2];
        charArr[num2] = ch;
        
        return String.valueOf(charArr);
    }
}