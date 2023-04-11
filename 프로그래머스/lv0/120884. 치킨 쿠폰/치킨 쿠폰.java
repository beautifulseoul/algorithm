class Solution {
    public int solution(int chicken) {
        
        int coupon = chicken;
        int service = 0;
        
        while(coupon > 9) {
            service += coupon / 10;
            coupon = coupon - (coupon / 10) * 10 + coupon / 10; 
        }

        return service;
    }
}