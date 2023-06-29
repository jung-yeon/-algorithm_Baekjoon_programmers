class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        // int[] answer = new int[queries.length];
        int qNum = queries.length;
        for(int i = 0; i < qNum; i++){
            for(int j = queries[i][0]; j <= queries[i][1]; j ++){
                if(j % queries[i][2] == 0){
                    arr[j]++;
                }
            }
        }
        return arr;
    }
}