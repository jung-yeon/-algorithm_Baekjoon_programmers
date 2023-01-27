
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int N, M;
        int T;
        int cnt;
        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            cnt = 0;
            N = sc.nextInt();
            M = sc.nextInt();
            for (int j = N; j <= M; j++) {
                int t = j;
                if(j == 0){
                    cnt++;
                    continue;
                }
                while (t > 1) {
                    if (t % 10 == 0) {
                        cnt++;
                    }
                    t /= 10;
                }
            }
            System.out.println(cnt);
        }


    }

}
