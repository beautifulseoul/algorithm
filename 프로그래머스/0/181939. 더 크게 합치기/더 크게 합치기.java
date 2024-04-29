class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        answer = Integer.valueOf(a + "" + b) >= Integer.valueOf(b + "" + a) ? Integer.valueOf(a + "" + b) : Integer.valueOf(b + "" + a);
        return answer;
    }
}