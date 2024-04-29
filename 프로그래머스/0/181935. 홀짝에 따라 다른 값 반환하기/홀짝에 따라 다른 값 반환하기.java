class Solution {
    public int solution(int n) {
        int sum = 0;
        if (n % 2 == 0) {                     // 짝수
            for (int i = 1; i <= n; i++) {
                if (i % 2 == 0) { sum += i * i;}
            }
        } else {                              // 홀수
            for (int i = 1; i <= n; i++) {
                if (i % 2 != 0){ sum += i;}
            }
        } 
        return sum;
    }
}