import java.util.stream.IntStream;

class Solution {
    public int[] solution(int n, int[] numlist) {

        IntStream intStream = IntStream.of(numlist);
        
        return intStream.filter(s -> s % n == 0).toArray();
    }
}