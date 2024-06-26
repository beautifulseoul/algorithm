import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        char[] charArr = a.toCharArray();
        StringBuilder sb = new StringBuilder();
        
        for(char c : charArr){
            if(Character.isUpperCase(c)) {
                sb.append(Character.toLowerCase(c));
            } else {
                sb.append(Character.toUpperCase(c));
            }
        }
      
        System.out.println(sb);
    }
}