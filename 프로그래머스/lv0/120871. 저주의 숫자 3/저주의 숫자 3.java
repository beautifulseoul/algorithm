class Solution {
    public int solution(int n) {
 
        int count = 0;
        int answer = 0;
        
            for(int i = 1; count != n; i++) {
                if((i % 3 !=0) && !((i + "").contains("3"))) {
                    count++;
                    answer = i;
                } 
            }
        return answer;
    }
}