public class Solution {
    public String solution(int q, int r, String code) {
        String answer = "";
        String[] strings = new String[code.length()];
        for(int i = 0; i<strings.length; i++){
            strings[i] = String.valueOf(code.charAt(i));
            if(i%q == r){
                answer+=strings[i];
            }
        }
        return answer;
    }
}

