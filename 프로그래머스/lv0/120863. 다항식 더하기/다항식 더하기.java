class Solution {
    public String solution(String polynomial) {
        
        String[] strArr = polynomial.split(" ");        
        
        int coefficient = 0;
        int constant = 0;
        
        for(int i = 0; i < strArr.length ; i+=2) {
            switch(strArr[i].indexOf("x")) {
                case -1 : 
                    constant +=Integer.valueOf(strArr[i]);
                    break;
                case 0 :
                    coefficient +=1;
                    break;
                default:
                    coefficient +=Integer.valueOf(strArr[i].replace("x", ""));
            }
        }
      
        
        
        
         System.out.println(constant);
        System.out.println(coefficient);
        String zzz = "x";
         // System.out.println(zzz.replace("x", ""));    
        String answer = "";
        if(constant == 0) {
            answer = (coefficient == 1)? "x" : coefficient + "x";
        } else if(coefficient == 0) {
            answer = constant + "";
        } else {
            answer = (coefficient == 1)? "x" + " + " + constant : coefficient + "x" + " + " + constant;
        }
            // (? coefficient + "x" : coefficient + "x" + " + " + constant;
        return answer;
    }
}