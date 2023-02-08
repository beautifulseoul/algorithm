class Solution {
         public int solution(int number, int limit, int power) {
        int cost = 0;
        int count;

        for(int i = 1; i <= number; i++) {
            count = 0;
            for(int j = 1; j < (int)(Math.sqrt(i)) + 1 ; j++) {

                if (i % j == 0) {
                    if(Math.sqrt(i)==j) {
                        count +=1;
                    } else {
                        count +=2;
                    }
                    
                }

            }
            System.out.println(count);

            cost += (count <= limit) ? count : power;

        }  // 두번쨰 for문 끝

        return cost;

    }
}