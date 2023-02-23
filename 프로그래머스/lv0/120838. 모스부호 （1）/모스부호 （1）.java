class Solution {
    public String solution(String letter) {
        
        String[] morse = {
            ".-", "-...", "-.-.", "-..", ".",  // a, b, c, d, e
            "..-.", "--.", "....", "..", ".---", // f, g, h, i, j
            "-.-", ".-..", "--", "-.", "---", // k, l, m, n, o
            ".--.","--.-", ".-.", "...", "-",    // p, q, r, s, t
            "..-","...-",".--","-..-", "-.--", "--.." // u, v, w, x, y, z
        };
        
        String[] charArr = letter.split(" ");        
        StringBuilder sb = new StringBuilder();
                
        for(int i = 0; i < charArr.length; i++) {
            for(int j = 0; j < morse.length; j++) {
                if(morse[j].equals(charArr[i])) {
                    sb.append((char)((int)'a' + j));
                }
            }
        }
        
        return sb.toString();
    }
}