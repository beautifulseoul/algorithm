import java.util.Arrays;

class Solution {
    public int[] solution(int[][] score) {
        
        int length = score.length;
        
        // 첫번째 배열
        int[] intArr = new int[length];
        for(int i = 0; i < length; i++) {
            intArr[i] = score[i][0] + score[i][1];
        }
        
        // 정렬된 배열
        int[] arrangedArr = Arrays.copyOf(intArr, length);
        Arrays.sort(arrangedArr);
        
        Loop : for(int i = 0; i < length; i++) {
            for(int j = length - 1; j >= 0; j--) {
                if(intArr[i] == arrangedArr[j]) {
                    intArr[i] = length - j;
                    
                    System.out.println("i=" + i + ", j=" + j);
                    continue Loop;
                }
            }
        }
        
        


        return intArr;
    }
}