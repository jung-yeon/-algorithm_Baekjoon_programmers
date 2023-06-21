import java.util.HashMap;
class Solution {
    public int solution(int n, String control) {
        int answer = 0;
        HashMap<String,Integer> hashMap = new HashMap<>();
        hashMap.put("w",1);
        hashMap.put("s",-1);
        hashMap.put("a",-10);
        hashMap.put("d",10);
        
        String[] tokens = control.split("");
        for(int i = 0; i < tokens.length; i++){
            n+=hashMap.get(tokens[i]);
        }
        answer = n;
        return answer;
    }
}