class Solution {
    public String solution(String my_string, int n) {
        // String[] stringArr = new String[my_string.length()];
        StringBuffer sb = new StringBuffer(my_string.length() * n);   
    
        for(int i = 0; i < my_string.length() ; i++) {
            for(int j = 0; j < n ; j++){
                sb.append(my_string.charAt(i));
                System.out.print(my_string.charAt(i));
            }
        }
        
        
        String answer = "";
        return sb.toString();
    }
}