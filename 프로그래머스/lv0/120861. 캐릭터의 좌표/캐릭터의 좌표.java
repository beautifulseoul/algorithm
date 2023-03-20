class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        
        int [] answer = {0, 0};
        int xAbsMax = board[0] / 2;
        int yAbsMax = board[1] / 2;
        
        for(String str : keyinput) {
            switch(str) {
                case "left" : answer[0] = (answer[0] == -xAbsMax)? answer[0] : answer[0] - 1;
                    break;
                case "right" : answer[0] = (answer[0] == xAbsMax)? answer[0] : answer[0] + 1;
                    break;
                case "up" : answer[1] = (answer[1] == yAbsMax)? answer[1] : answer[1] + 1;
                    break;
                case "down" : answer[1] = (answer[1] == -yAbsMax)? answer[1] : answer[1] - 1;
                    break;
            }
        }
            
        return answer;
    }
}