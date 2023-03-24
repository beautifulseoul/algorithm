class Solution {
    public int solution(int[][] board) {
        
        int[][] newArr = new int[board.length][board[0].length];
        
        // 지뢰 중심
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[i].length; j++) {
                if(board[i][j] == 1) {
                    for(int k = i - 1; k <= i + 1; k++) {
                        for(int l = j - 1; l <= j + 1; l++) {
                            try{newArr[k][l] = 1;} catch(Exception e) {}       
                        }
                    }
                }
            }
        }
        
        int count = 0;
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[i].length; j++) {
                if(newArr[i][j] == 0) count++;
                System.out.println(newArr[i][j]);
            }
        }
        return count;
    }
}