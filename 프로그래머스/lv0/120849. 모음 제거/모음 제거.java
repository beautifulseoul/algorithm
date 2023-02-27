class Solution {
    public String solution(String my_string) {

        for(int i = 0; i < my_string.length(); i++) {
            my_string = my_string.replaceAll("[aeiou]", "");
        }

        return my_string;
    }
}