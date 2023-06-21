class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int oddNum = 0;
        int evenNum = 0;
        String oddStr = "";
        String evenStr = "";
        for(int num: num_list){
            if(num % 2 == 0){
                evenStr += String.valueOf(num);
            }
            else{
                oddStr += String.valueOf(num);
            }
        }
        oddNum = Integer.parseInt(oddStr);
        evenNum = Integer.parseInt(evenStr);
        answer = oddNum + evenNum;
        return answer;
    }
}