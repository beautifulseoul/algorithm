class Solution {
    public int[] solution(long n) {
        
        int[] answer = new int[(int)(Math.log10(n)+1)];
        
        for(int i=0; true ; i++){
            answer[i] = (int)(n%10);
            n /= 10;
            if(n==0){
                break;
            }
            
        }
        return answer;
    }
}