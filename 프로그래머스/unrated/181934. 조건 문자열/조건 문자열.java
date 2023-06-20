class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        String str1 ="";
        boolean bool = false;
        if(eq.equals("=") ){
            str1 = ineq+eq;
        }
        else if(eq.equals("!")){
            str1 = ineq;
        }
        if(str1.equals("<=")){
            if(n <= m){
                bool = true;
            }
        } else if(str1.equals(">=")){
            if(n >= m){
                bool = true;
            }
        } else if(str1.equals("<")){
            if(n < m){
                bool = true;
            }
        } else if(str1.equals(">")){
            if(n > m){
                bool = true;
            }
        }
        if (bool){
            answer = 1;
        }
        else{
            answer=0;
        }
        return answer;
    }
}