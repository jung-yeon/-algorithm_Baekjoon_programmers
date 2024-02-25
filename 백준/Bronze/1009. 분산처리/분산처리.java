import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int[] resultArr = new int[T];
        for(int i = 0; i<T; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            //왜 4의 배수로 따져 줘야하는지
            //4의 배수인지 따져야 하는 이유는 10으로 나누었을 때 발생하는 주기성 때문
            //4의 배수일 때마다 일의 자리에 주기가 발생하게 되기 때문에
            int answer = (int) Math.pow(a % 10, (b % 4 == 0) ? 4 : b % 4) % 10;
            //답이 0일때는 10을 저장
            answer = answer == 0 ? 10 : answer;
            resultArr[i] = answer;

        }
        for(int num : resultArr){
            System.out.println(num);
        }
    }
}
