class Solution {
        public String solution(int age) {
        StringBuilder strBuilder = new StringBuilder();

        while(age != 0) {
            switch(age % 10) {
                case 0 : strBuilder.append("a");
                    break;
                case 1 : strBuilder.append("b");
                    break;
                case 2 : strBuilder.append("c");
                    break;
                case 3 : strBuilder.append("d");
                    break;
                case 4 : strBuilder.append("e");
                    break;
                case 5 : strBuilder.append("f");
                    break;
                case 6 : strBuilder.append("g");
                    break;
                case 7 : strBuilder.append("h");
                    break;
                case 8 : strBuilder.append("i");
                    break;
                case 9 : strBuilder.append("j");
            }
            age /= 10;
        }
            
        char[] charArr = strBuilder.toString().toCharArray();    
        char[] reverseString = new char[charArr.length];
        for(int i =0; i < charArr.length; i++) {
            reverseString[i] = charArr[charArr.length - i -1];
        }   
        return String.valueOf(reverseString);
    }
}