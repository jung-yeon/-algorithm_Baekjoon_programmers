class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        String[] my_strArr  = my_string.split("");
        String[] overwrite_strArr = overwrite_string.split("");
        for(int i = 0; i < s; i++){
            answer += my_strArr[i];
        }
        for(int i = 0; i < overwrite_strArr.length; i++){
            answer += overwrite_strArr[i];
        }
        if(answer.length()<my_strArr.length){
            int n = my_strArr.length - answer.length();
            for(int i = answer.length(); i < my_strArr.length; i++){
                answer+=my_strArr[i];
            }
        }
        return answer;
    }
}