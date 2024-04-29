class Solution {
    public int solution(int n, String control) {
        char[] charArr = control.toCharArray();
        
        for(char c : charArr) {
            switch(c) {
                case 'w' :
                    n += 1;
                    break;
                case 's':
                    n -= 1;
                    break;
                case 'd':
                    n += 10;
                    break;
                case 'a':
                    n -= 10;
                    break;
            }
        }
        return n;
    }
}