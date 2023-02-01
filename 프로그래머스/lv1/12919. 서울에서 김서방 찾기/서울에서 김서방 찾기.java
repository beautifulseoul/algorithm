class Solution {
    public String solution(String[] seoul) {

        int temp = 0;
        for(int i=0;i<seoul.length;i++) {
            if (seoul[i].equals("Kim")){
                temp =i;
            }
        }

        String answer = "김서방은 " + temp + "에 있다";
        return answer;
}
}