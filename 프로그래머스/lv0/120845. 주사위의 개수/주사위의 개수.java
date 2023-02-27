class Solution {
    public int solution(int[] box, int n) {
        
        int num = 1;
        for(int boxLength : box) {
            num = num * (boxLength / n);
        }
        
        return num;
    }
}