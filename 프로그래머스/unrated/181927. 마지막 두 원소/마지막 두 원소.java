class Solution {
    public int[] solution(int[] num_list) {
        int numList_len = num_list.length;
        int[] answer = {};
        answer = new int[numList_len+1];
        int resultNum = 0;
        if(num_list[numList_len - 1] <= num_list[numList_len - 2]){
            resultNum = num_list[numList_len - 1]*2;
        }else{
            resultNum = num_list[numList_len - 1]-num_list[numList_len - 2];
        }
        for(int i = 0; i<numList_len; i++){
            answer[i] = num_list[i];
        }
        answer[numList_len] = resultNum;
        return answer;
    }
}