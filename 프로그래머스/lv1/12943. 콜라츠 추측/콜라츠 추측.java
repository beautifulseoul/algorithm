class Solution {
    public int solution(int num2) {

        int count =0;
        double num = (double)num2;
        while (num!=1) {
            if(num%2==0){
                num /=2;
            } else {
                num=num*3 + 1;
            }
            count++;
            if(count==500){
                count=-1;
                break;
            }
        }
        
        return count;
    }
}