import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Integer> numList = new ArrayList<>();
        int answer = 0;
        if (N == 1) {
            int a = sc.nextInt();
            answer = a * a;
        } else {
            for (int i = 0; i < N; i++) {
                int a = sc.nextInt();
                numList.add(a);
            }
            Collections.sort(numList);
            int len = numList.size();
            answer = numList.get(0) * numList.get(len - 1);

        }

        System.out.println(answer);
    }
}
