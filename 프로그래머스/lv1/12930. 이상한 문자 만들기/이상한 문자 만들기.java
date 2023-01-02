import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String[] arr = s.split("");
        String answer = "";

        System.out.println(Arrays.toString(arr));

        int count =0;
        for(int i=0;i<arr.length;i++) {
            if(arr[i].equals(" ")){
                count =0;
                answer += " ";
            } else {
                answer += (count%2==0)? arr[i].toUpperCase() : arr[i].toLowerCase();
                count +=1;
            }
        }
        return answer;
    }
}