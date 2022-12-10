
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int arr[] = new int[N];
        for(int i = 0 ; i < N; i++){
            if(i > 0){
                arr[i] = scanner.nextInt() + arr[i-1];
            }
            else{
                arr[i] = scanner.nextInt();
            }
        }
        int sum[] = new int[M];
        for(int i = 0; i < M; i++){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if(a == 1){
                sum[i] = arr[b - 1];
            } else{
                sum[i] = arr[b - 1] - arr[a - 2];
            }

        }
        for(int i : sum){
            System.out.println(i);
        }
    }
}
