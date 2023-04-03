class Solution {
    public int solution(String[] spell, String[] dic) {
        
        int answer = 2;
        
        Loop : for(int i = 0; i < dic.length; i++) {
            if(spell.length == dic[i].length()) {
                for(int j = 0; j < spell.length; j++) {
                    if(!dic[i].contains(spell[j])) continue Loop;                
                }
                answer = 1;  
            }
        }     
        return answer;
    }
}