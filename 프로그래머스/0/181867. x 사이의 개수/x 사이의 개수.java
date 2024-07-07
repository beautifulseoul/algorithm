class Solution {
    public int[] solution(String myString) {
        
        String[] strArr = myString.split("x");
        int intArrLength = strArr.length;
        
        if(myString.charAt(myString.length() - 1) == 'x') {
            intArrLength++;
        }
        int[] intArr = new int[intArrLength];
        
        for(int i = 0; i < strArr.length; i++) {
            intArr[i] = strArr[i].length();
        }
        
        return intArr;
    }
}