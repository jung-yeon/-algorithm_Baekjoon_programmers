class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String str1 = String.valueOf(a) + String.valueOf(b);
        int num2 = a * b*2;

        int num1 = Integer.parseInt(str1);
        if(num1 > num2){
            answer = num1;
        }else{
            answer=num2;
        }
       
        return answer;
    }
}