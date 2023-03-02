class Solution {
    public String solution(String cipher, int code) {
        StringBuilder stb = new StringBuilder();
        
        for(int i = code -1; i < cipher.length(); i += code) {
            stb.append(cipher.charAt(i));
        }
        
        return stb.toString();
    }
}