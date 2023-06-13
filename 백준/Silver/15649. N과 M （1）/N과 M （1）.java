import java.util.Scanner;

public class Main {

    //result값 담을 arr배열 전역 번수로 선언
    public static int[] arr;
    //방문 했는지 안했는지 확인할 visit boolean 선언
    public static boolean[] visit;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        //N,M입력
        int N = in.nextInt();
        int M = in.nextInt();

        arr = new int[M];
        visit = new boolean[N];
        dfs(N, M, 0);

    }

    public static void dfs(int N, int M, int depth) {
        if (depth == M) {
            for (int val : arr) {
                System.out.print(val + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 0; i < N; i++) {
            if (!visit[i]) {
                visit[i] = true;
                arr[depth] = i + 1;
                dfs(N, M, depth + 1);
                // 자식노드 방문이 끝나고 돌아오면 방문노드를 방문하지 않은 상태로 변경
                visit[i] = false;
            }
        }
    }

}