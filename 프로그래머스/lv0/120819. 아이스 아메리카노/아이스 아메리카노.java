class Solution {
    public int[] solution(int money) {
        int numOfCup = money / 5500;
        int change = money % 5500;
        
        int[] answer = {numOfCup, change};
        return answer;
    }
}