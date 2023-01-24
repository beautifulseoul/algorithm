class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        int num = a>b? a-b:b-a;
        int num2 = num>=0?num+1:-num-1;
        long result =((long)(a+b)*num2)/2;
        return result;
            
    }
}