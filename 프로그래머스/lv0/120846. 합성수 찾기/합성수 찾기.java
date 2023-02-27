class Solution {
    public int solution(int n) {
        
        // n = 15;
        
        int count;
        int num = 0;
        for(int i = 1; i <= n; i++) {
            count = 0;
            // System.out.println("i= " + i);
            for(int j = 1; j < (int)(Math.sqrt(i)) + 1; j ++) {
                System.out.println(j);
                if( i % j == 0) {
                    count = (j * j == i)? count + 1 : count + 2;
                }
                
                if(count >= 3) {
                    num ++;
                    // System.out.println(i);
                    break;
                }
            }
        }
        return num;
    }
}