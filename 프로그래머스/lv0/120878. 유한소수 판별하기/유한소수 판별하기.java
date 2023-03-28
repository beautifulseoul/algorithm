class Solution {
    public int solution(int a, int b) {
    
        // 기약분수 만들기
        for(int i = b; i > 0; i--) {
            if((a % i == 0) && (b % i == 0)) {
                a /= i;
                b /= i;
            }
        }
      
        // 분모에서 약수 2 없애기
        while(b % 2 == 0) {
            b /= 2;
        }
        
        // 분모에서 약수 5 없애기
        while(b % 5 == 0) {
            b /= 5;
        }
        
        return (b == 1)? 1 : 2;
    }
}