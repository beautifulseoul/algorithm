class Solution {
    public String solution(String code) {
        
        // 다른사람 코드보고 수정한 것
        char[] charArr = code.toCharArray();
        int mode = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < charArr.length; i++) {
            if (charArr[i] == '1') {
                mode = (mode == 1) ? 0 : 1;
                continue;
            }
            if (i % 2 == mode) {
                sb.append(charArr[i]);
            }
        }

        String answer = sb.toString();
        if (answer.equals("") | answer == null) {
            answer = "EMPTY";
        }
        return answer;
        
        
        // 원래썼던 코드
//         char[] charArr = code.toCharArray();
//         boolean mode = false;
//         StringBuilder sb = new StringBuilder();
        
//         for (int i = 0; i < charArr.length; i++) {
//             if (charArr[i] == '1') {
//                 mode = !mode;
//                 continue;
//             }
//             if (mode == false & i % 2 == 0) {
//                 sb.append(charArr[i]);
//             } else if (mode == true & i % 2 != 0) {
//                 sb.append(charArr[i]);
//             }
//         }
        
//         String answer = sb.toString();
//         if (answer.equals("") | answer == null) {
//             answer = "EMPTY";
//         }
//         return answer;
    }
}