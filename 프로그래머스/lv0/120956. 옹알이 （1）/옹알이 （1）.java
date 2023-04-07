class Solution {
    public int solution(String[] babbling) {
        
        String[] wordArr = {"aya", "ye", "woo", "ma"};
        int count = 0;
        
        for(int i = 0; i < babbling.length; i++) {
            for(int j = 0; j < wordArr. length; j++) {
                if(babbling[i].contains(wordArr[j])) {
                    babbling[i] = babbling[i].replaceFirst(wordArr[j], " ");
                }
            }
            if(babbling[i].replaceAll(" ", "").equals("")) count++;
        }
        return count;
    }
}