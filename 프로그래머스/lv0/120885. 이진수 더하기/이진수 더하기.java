class Solution {
    public String solution(String bin3, String bin4) {
        
        int num = Integer.parseInt(bin3, 2) + Integer.parseInt(bin4, 2);
        return Integer.toString(num, 2);
    }
}