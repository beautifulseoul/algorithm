class Solution {
    public boolean solution(String s) {

        boolean result=true;

        
        for(int i=0; i<s.length();i++) {
            if (!(('0' <= s.charAt(i) && s.charAt(i) <= '9') && (s.length()==4 ||s.length()==6))){
                result = false;
            }
        }

        return result;
    }
}