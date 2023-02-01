class Solution {
    public String solution(int n) {

        char[] arr = new char[n];

        for(int i=0;i<n;i++){
            arr[i] = (i%2==0)? '수' : '박';
        }

        return String.valueOf(arr);
    }
}