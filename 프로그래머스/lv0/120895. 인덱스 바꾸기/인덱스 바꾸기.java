class Solution {
    public String solution(String my_string, int num1, int num2) {
        
        char[] charArr = my_string.toCharArray();
        charArr[num1] = charArr[num2];
        charArr[num2] = my_string.charAt(num1);
        
        return String.valueOf(charArr);
    }
}