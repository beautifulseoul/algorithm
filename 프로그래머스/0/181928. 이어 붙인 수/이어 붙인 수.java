class Solution {
    public int solution(int[] num_list) {
        StringBuilder evenStr = new StringBuilder();
        StringBuilder oddStr = new StringBuilder();
        
        for(int num : num_list) {
            if(num % 2 == 0) {
                evenStr.append(num);
            } else {
                oddStr.append(num);
            }
        }
        
        int answer = Integer.valueOf(evenStr.toString()) + Integer.valueOf(oddStr.toString());
        return answer;
    }
}