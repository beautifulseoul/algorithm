import java.util.Arrays;

class Solution {
    public int[] solution(int n) {
        int[] intArr = new int[15];
        int num = 0;
        for(int i = 2; i <= n; i++) {
            if(n % i == 0) {
                int count = 0;
                for(int j = 1; j < (int)Math.sqrt(i) + 1; j ++) {
                    if(i % j == 0) {
                        count ++;
                    }
                }
                if(count == 1) {
                    intArr[num] = i;
                    num++;
                }
            }
        }

        int[] answer = {};
        for(int i = 0; i < intArr.length; i++) {
            if(intArr[i] == 0) {
                answer = Arrays.copyOfRange(intArr, 0, i);
                break;

            }
        }

        return answer;
    }
}