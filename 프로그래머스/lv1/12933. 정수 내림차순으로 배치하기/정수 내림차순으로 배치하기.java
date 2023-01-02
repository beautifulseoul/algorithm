import java.util.Arrays;

class Solution {
    public long solution(long n) {

        int leng = (int)Math.log10(n)+1; //자릿수
        String str = "";

        int[] arr = new int[leng];
        int[] arr2 = new int[leng];

        for(int i =0; i<leng;i++){
            arr[i] = (int)(n%10);
            n/=10;
        }
        Arrays.sort(arr);
        for(int i=0,j=arr.length-1 ; i<leng ; i++, j--){
            arr2[i] = arr[j];
        }

        for(int i=0; i<leng;i++){
            str +="" + arr2[i];
        }
        
        Long answer = Long.parseLong(str);
        return answer;

    }
}