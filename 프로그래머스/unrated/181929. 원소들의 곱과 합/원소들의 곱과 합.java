import java.lang.Math;
class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int sum = 0;
        int mul = 1;
        for(int num : num_list){
            mul *= num;
            sum += num;
        }
        if(mul < Math.pow(sum,2)){
            answer = 1;
        } else{
            answer = 0;
        }
        return answer;
    }
}