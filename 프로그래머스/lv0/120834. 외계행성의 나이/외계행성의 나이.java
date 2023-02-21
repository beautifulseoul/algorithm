class Solution {
    public String solution(int age) {
                    
        StringBuilder strBuilder = new StringBuilder();
        
        while(age>0){
            strBuilder = strBuilder.insert(0, (char)(age % 10 + (int)'a'));
            age /= 10;
        }

        return strBuilder.toString();
    }
}