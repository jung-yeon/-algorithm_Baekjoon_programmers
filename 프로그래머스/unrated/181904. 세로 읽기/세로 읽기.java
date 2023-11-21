import java.util.Arrays;

public class Solution {
    public String solution(String my_string, int m, int c) {
        String [] strings = new String[my_string.length()];
        String answer = "";
        int groupSize = m;
        int numOfGroups = strings.length / groupSize;
        int count =0;
        for(int i = 0; i < my_string.length(); i++){
            strings[i] = String.valueOf(my_string.charAt(i));
        }
        String[] selectedElements = new String[numOfGroups];
        for (int i = 0; i < numOfGroups; i++) {
            int indexInGroup = c-1; // 두 번째 요소 선택
            selectedElements[i] = strings[i * groupSize + indexInGroup];
            answer += selectedElements[i];
        }


        return answer;
    }
    
}

