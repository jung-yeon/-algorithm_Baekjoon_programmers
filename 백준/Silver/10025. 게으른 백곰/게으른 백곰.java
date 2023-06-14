import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] tokens = str.split(" ");
        int N = Integer.parseInt(tokens[0]);
        int K = Integer.parseInt(tokens[1]);

        int arr[] = new int[1000001];
        for (int i = 0; i < N; i++) {
            String iceStr = br.readLine();
            String[] iceArr = iceStr.split(" ");
            int g = Integer.parseInt(iceArr[0]);
            int x = Integer.parseInt(iceArr[1]);
            arr[x] = g;
        }

        int sum = 0;
        int max = 0;
        //앞뒤 K만큼 떨어진 양동이까지 닿을 수 있음 +1은 자기자신 포함
        int window = 1 + (2 * K);
        boolean bool = false;
        for (int i = 0; i < arr.length; i++) {
//             초반 k-1범위 전까지는 sum을 max랑 비교하면안됨.
            //처음 7개의 숫자를 sum에 더해버리면 max=0보다 무조건 크기때문에 비교 하면 안됨
            //max와 sum을 동일하게 하고 시작
//            if (i == window - 1) {
//                bool = true;
//            }
            if (i < window - 1) {
                max = sum;
            }

            if (i >= window) {
                sum -= arr[i - window];
            }
            sum += arr[i];
            if (sum > max) {
                max = sum;
            }
        }
        System.out.println(max);


    }
}
