class Solution {
    public boolean solution(int x) {
        
        int y= x;
        int num =0;
        boolean answer=false;

        do {
            num +=x%10;
            x=x/10;
            }
        while (x!=0);

        System.out.println(num);

        if(y % num==0){
            answer =true;
        } 
    
        return answer;
    }
}