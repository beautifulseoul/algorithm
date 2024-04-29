class Solution {
    public int solution(int[] num_list) {
        
        int oper1 = 1;
        int oper2 = 0;
        for(int i = 0; i < num_list.length; i++) {
            oper1 *= num_list[i];
            oper2 += num_list[i];
        }
        oper2 = oper2 * oper2;
        
        int answer = oper1 < oper2 ? 1 : 0;
        return answer;
    }
}