class Solution {
    public int solution(int hp) {
        
        int num = 0;
        
        for(int i = 5; i >= 1 ; i -=2) {
            num += hp / i;
            hp = hp % i;
        }

        return num;
    }
}