import java.util.HashMap;
class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        // 이름과 그리움 점수를 매핑하는 HashMap 생성
        HashMap<String, Integer> yearningMap = new HashMap<>();
        for (int i = 0; i < name.length; i++) {
            yearningMap.put(name[i], yearning[i]);
        }

        // 사진별 추억 점수를 저장할 배열 초기화
        int[] memories = new int[photo.length];

        // 각 사진에 대해 추억 점수 계산
        for (int i = 0; i < photo.length; i++) {
            int photoScore = 0;
            for (String person : photo[i]) {
                if (yearningMap.containsKey(person)) {
                    photoScore += yearningMap.get(person);
                }
            }
            memories[i] = photoScore;
        }

        return memories;
    }

}