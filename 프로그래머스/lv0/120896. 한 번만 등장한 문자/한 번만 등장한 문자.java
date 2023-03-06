class Solution {
    public String solution(String s) {

        String str = new String();
        
        for(int i = 0; i < 26; i++) {
            char ch = (char)((int)'a' + i);
            if(s.indexOf(ch) != -1 && (s.indexOf(ch) == s.lastIndexOf(ch))) {
                str += (char)((int)'a' + i);
            }

        }
        return str;
    }
}