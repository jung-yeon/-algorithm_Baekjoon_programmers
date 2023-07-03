import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void insertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            for (int j = i - 1; j >= 0 && arr[j] > key; j--) {
                swap(arr, j+1, j);
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        int size = st.countTokens();

        int resultArr[] = new int[size];
        int i = 0;
        // resultArr에 값 넣어주기
        while (st.hasMoreTokens()) {
            resultArr[i] = Integer.parseInt(st.nextToken());
            i++;
        }

        int sumArr[] = new int[size];
        insertionSort(resultArr);
        int sum = 0;
        int resultSum = 0;
        for(int a = 0; a < size; a++){
            sum+=resultArr[a];
            sumArr[a] = sum;
        }
        for(int num : sumArr){
            resultSum+=num;
        }

        System.out.println(resultSum);


    }
}
