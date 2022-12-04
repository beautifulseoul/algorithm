class Solution {
    public int solution(int[] numbers) {
        

        int sum=0;
        int[] numbers2 = new int[10];

        for (int i=0;i<10;i++){
            numbers2[i]=i;
        }

        for(int i=0;i<numbers.length;i++){
            numbers2[numbers[i]]=0;
        }

        for(int i=0;i<numbers2.length;i++) {
            sum +=numbers2[i];
        }
    
        return sum;
    }
}