class Solution {
    public String[] solution(String[] quiz) {

        int num = 0;
        for(int i = 0; i < quiz.length; i++) {
            String[] element = quiz[i].split(" ");
            num = Integer.parseInt(element[0]);
            
            if(element[1].equals("-")) {
                num -= Integer.parseInt(element[2]);
            } else {
                num += Integer.parseInt(element[2]);
            }
            quiz[i] = (num == Integer.parseInt(element[4]))? "O" : "X";
        }

        return quiz;
    }
}