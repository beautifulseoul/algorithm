class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        String[] tempArr = new String[finished.length];
        String[] answer = {};
        
        int count = 0;
        for (int i = 0; i < finished.length; i++) {
            if (!finished[i]) {
                tempArr[count] = todo_list[i];
                count++;
            }
        }

        answer = new String[count];
        for (int i = 0; i < count; i++) {
            answer[i] = tempArr[i];
        }
        return  answer;
    }
}