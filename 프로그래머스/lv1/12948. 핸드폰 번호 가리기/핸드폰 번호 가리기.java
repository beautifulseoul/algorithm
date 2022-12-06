class Solution {
    public String solution(String phone_number) {
        
        String y=phone_number.substring(0,phone_number.length()-4);
        String text = y.replaceAll("[0-9]","*");
        System.out.println(text);

        String x = phone_number.substring(phone_number.length() - 4);
        System.out.println(x);
        
        
        return text + x;

    }
}