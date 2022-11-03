
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main{
    static int min = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Integer[] weights = new Integer[N];

        for(int i = 0; i < N; i++){
            weights[i] = Integer.valueOf(br.readLine());
        }
        //정렬 완료
        Arrays.sort(weights, Collections.reverseOrder());
        //TODO: 만약 4개의 로프 중 15 8 7 5순서라면
        // 15일 때 최대 무게는 15
        // 15,8 일때 최대 무게는 16
        // 15,8,7일때 최대 무게는 21
        // 15,8,7,5일 때 최대 무게는 20
        // 이 중에서 가장 큰 최대 무게는 21이 나오게끔 해야 함!!
        int[] minList = new int[weights.length];
        for(int i = 0; i < weights.length; i++){
            minList[i] = weights[i]*(i+1);
        }
        Arrays.sort(minList);
        System.out.println(minList[minList.length - 1]);
    }
}
