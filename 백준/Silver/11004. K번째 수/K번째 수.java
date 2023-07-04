import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 첫번째 줄 입력
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 입력한 값을 변수 N,K에 각각넣어줍니다.
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        //두번째 줄에 배열에 넣을 N개의 숫자 입력
        st = new StringTokenizer(br.readLine());
        //tokens배열에 넣어줍니다.
        int[] tokens = new int[N];
        for (int i = 0; i < N; i++) {
            tokens[i] = Integer.parseInt(st.nextToken());
        }
        // S : start
        // E : End
        quickSort(tokens, 0, N - 1, K - 1);
        System.out.println(tokens[K - 1]);
    }

    //퀵 정렬은 기준값(pivot)을 선정해 해당 값보다 작은 데이터와 큰 데이터로 분류하는 것을 반복해 정렬하는 알고리즘
    //배열 가운데값을 pivot으로 정해 변수에 넣어줍니다.

    public static void quickSort(int[] tokens, int S, int E, int K) {
        if (S < E) {
            int pivot = partition(tokens, S, E);
            if (pivot == K) {
                return;
            } // K번째 수가 pivot이면 더 이상 구할 필요 없음
            else if (K < pivot) {
                quickSort(tokens, S, pivot - 1, K); // K가 pivot보다 작으면 왼쪽그룹만 정렬
            } else {
                quickSort(tokens, pivot + 1,E, K); // K가 pivot보다 크면 오른쪽그룹만 정렬
            }
        }

    }

    public static int partition(int[] tokens, int S, int E) {
        if (S + 1 == E) {
            if (tokens[S] > tokens[E]) swap(tokens, S, E);
            return E;
        }
        int M = (S + E) / 2; //중앙값을 1번째 요소로 이동하기
        swap(tokens, S, M);
        int pivot = tokens[S];
        int i = S + 1, j = E;
        while (i <= j) {
            while (pivot < tokens[j] && j > 0) {
                j--;
            }
            while (pivot > tokens[i] && i < tokens.length - 1) {
                i++;
            }
            if (i <= j) {
                swap(tokens, i++, j--);
            }
        }
        //i == j pivot의 값을 양쪽으로 분리한 가운데에 오도록 설정
        tokens[S] = tokens[j];
        tokens[j] = pivot;
        return j;
    }

    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
