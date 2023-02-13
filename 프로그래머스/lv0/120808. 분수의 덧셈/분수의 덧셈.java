class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        
        int numer3 = numer1 * denom2 + numer2 * denom1;
        int denom3 = denom1 * denom2;
        
        int min = numer3 > denom3 ? denom3 : numer3;
        System.out.println(min);
        for(int i = min; i >= 1  ; i--) {
            if(numer3 % i == 0 && denom3 % i == 0){
                numer3 /= i;
                denom3 /= i; 
            }
        }
        int[] answer = {numer3, denom3};
        return answer;
    }
}