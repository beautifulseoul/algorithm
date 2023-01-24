class Solution {
    public String solution(int a, int b) {

        String date= "";
        int sum=0;
        
        int[] month = {31,29,31, 30,31,30, 31,31,30, 31,30,31};

        for(int i=1;i<=a-1;i++) {
            sum +=month[i-1]; // month까지 계산
        }
                sum +=b; //month + day까지 계산 완료

        date = switch (sum % 7) {
            case 0 -> "THU";
            case 1 -> "FRI";
            case 2 -> "SAT";
            case 3 -> "SUN";
            case 4 -> "MON";
            case 5 -> "TUE";
            case 6 -> "WED";
            default -> "에러";
        }; return date;
    } 
    
}