class Solution {
    public int solution(int num, int k) {
        

        
        int ordinalNum = 0;
        int count = 1;
        
        while(num != 0) {
            if(num % 10 == k) {
                ordinalNum = count;
            } 
            num /= 10;
            count++;
        }
        
        int answer = (ordinalNum == 0)? -1 : count - ordinalNum;
        return answer;
    }
}