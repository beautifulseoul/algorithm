class Solution {
    public int solution(int[] common) {
        
        if(common[2] - common[1] == common[1] - common[0]) {
            // 등차수열 (공차 : common difference)
            return common[0] + common.length * (common[1] - common[0]);            
        } else {
            // 등비수열 (공비 : common ratio)
            int commonRatio = common[1] / common[0];
            return common[common.length - 1] * commonRatio;
        }
    }
}