class Solution {
    public String solution(String my_string) {

        String[] strArr = {"a", "e", "i", "o", "u"};

        for(int i = 0; i < strArr.length; i++) {
            my_string = my_string.replaceAll(strArr[i], "");
        }

        return my_string;
    }
}