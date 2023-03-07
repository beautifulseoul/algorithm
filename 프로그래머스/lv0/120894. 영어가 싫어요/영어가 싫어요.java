class Solution {
    public long solution(String numbers) {
        // numbers = "onetwothreefourfivesixseveneightnineonetwothree";
        
        String[] numStr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] numArr = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        // String[] answerArr = new String[50];
        
        String st = "";
        while(numbers.length() != 0) {
        for(int i = 0; i < numStr.length; i++) { 
            if(numbers.contains(numStr[i]) && numbers.indexOf(numStr[i]) == 0) {
                numbers = numbers.replaceFirst(numStr[i], "");
                st += numArr[i];
            }
        }
        }

//         for(int i = 0; i < numStr.length; i++) {
//             if(numbers.contains(numStr[i])){
//                 answerArr[numbers.indexOf(numStr[i])] = numArr[i];
//                 numbers = numbers.replaceFirst(numStr[i], "");
//             }
//         }
        
          
        
//         StringBuilder stb = new StringBuilder();
//         for(int i =0; i < answerArr.length; i++) {
//             if(answerArr[i] != null) {
//                 stb.append(answerArr[i]);
//             } 
//         }
//         System.out.println(numbers);
//         return Long.parseLong(stb.toString());
        
        return Long.parseLong(st);
    }
}