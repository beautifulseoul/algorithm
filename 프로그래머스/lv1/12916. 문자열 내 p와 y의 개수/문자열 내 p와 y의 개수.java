class Solution {
    boolean solution(String s) {
        
        int countP = 0;
        int countY = 0;

        char arr[] = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if ((arr[i] == 'p') || (arr[i] == 'P')) {
                countP++;
            } else if ((arr[i] == 'y') || (arr[i] == 'Y')) {
                countY++;
            }
        }
        boolean result = (countP == countY) ? true : false;

        return result;  
        
    }
}