 class Solution {
       public int solution(int n) {

           int answer = 0;

           for(int i = 1; i < (int)Math.sqrt(n) + 1; i++) {
               if(n % i == 0) answer += i + (n / i);
           }

           if(n % Math.sqrt(n) == 0) {
               answer -= (int)Math.sqrt(n);
           }

           return answer;
       }
   }