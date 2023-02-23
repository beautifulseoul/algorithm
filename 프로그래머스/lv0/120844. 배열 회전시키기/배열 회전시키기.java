class Solution {
    public int[] solution(int[] numbers, String direction) {
        
        int[] intArr = new int[numbers.length];
        
        if(direction.equals("right")) {
            for(int i = 0; i < numbers.length ; i++) {
                    intArr[(i + 1) % numbers.length] = numbers[i];
                }
        } else {
            for(int i = numbers.length - 1; i >= 0; i--) {
                intArr[(i - 1 + numbers.length) % numbers.length] = numbers[i];
            }
        }
        
        return intArr;
    }
}