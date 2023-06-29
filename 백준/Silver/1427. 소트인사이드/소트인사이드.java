import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();
        String[] tokens = N.split("");
        int resultArr[] = new int[tokens.length];
        for (int i = 0; i < tokens.length ; i++) {
            resultArr[i] = Integer.parseInt(tokens[i]);
        }
        int num = resultArr.length;
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < num - 1; i++) {
            for (int j = i + 1; j < num; j++) {
                if (resultArr[i] < resultArr[j]) {
                    swap(resultArr, i, j);
                }
            }
            sb.append(resultArr[i]);
        }
        sb.append(resultArr[resultArr.length-1]);

        System.out.println(sb);
    }


}
