import java.util.Arrays;

class Solution {
    public int solution(String A, String B) {
        
        int length = A.length();
        char[] aArr = A.toCharArray();
        StringBuilder sb = new StringBuilder();

        if(A.equals(B)) return 0;
        
        for(int j = 0; j < length - 1; j++) {
            sb.setLength(0);
            
            sb.append(new String(aArr, length - j - 1, j + 1));        
            sb.append(new String(aArr, 0, length - j - 1)); 
            
            if(sb.toString().equals(B)) return j + 1;
        }

    return -1;
    }
}