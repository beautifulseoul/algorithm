class Solution {
    public int solution(int[] array, int n) {
        
        // int[] array = {1,2,4,5};
        // n = 3;
        
        int min = array[0] - n;
        int answer = array[0];
        
        for(int i = 0; i < array.length; i++) {
            if(Math.abs(array[i] - n) <= Math.abs(min)) {
System.out.println("array[i]-n=" + (array[i] - n) + ", Math.abs(min)=" + Math.abs(min) + ", min  =" + min);
                if((Math.abs(array[i] - n) == Math.abs(min)) && ((array[i] - n) > min)) {
                     continue;
                }
                min = array[i] - n;
                answer = array[i];
            }
        }
        
        return answer;
    }
}