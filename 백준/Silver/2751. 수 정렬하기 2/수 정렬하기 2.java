import java.io.*;
public class Main {
    public static int A[];
    public static int result[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        A = new int[N + 1];
        result = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            A[i] = Integer.parseInt(br.readLine());
        }

        merge_sort(1, N);
        for (int i = 1; i <= N; i++) {
            bw.write(A[i]+"\n");
        }
        bw.flush();
        bw.close();
    }

    // 병합정렬 메서드
    // s는 start
    // e는 end
    private static void merge_sort(int s, int e) {
        if (e - s < 1) return;
        int m = s + (e - s) / 2;
        merge_sort(s, m);
        merge_sort(m + 1, e);
        for (int i = s; i <= e; i++) {
            result[i] = A[i];
        }
        int k = s;
        int index1 = s;
        int index2 = m + 1;
        // 두 그룹을 병합하는 로직
        while (index1 <= m && index2 <= e) {
            //양쪽 그룹의 index가 가리키는 값을 비교해 더 작은 수를 선택해 배열에 저장하고,
            // 선택된 데이터의 index값을 오른쪽으로 한 칸 이동하기
            if (result[index1] > result[index2]) {
                A[k] = result[index2];
                k++;
                index2++;
            } else {
                A[k] = result[index1];
                k++;
                index1++;
            }
        }
        while (index1 <= m) {
            //한쪽그룹이 모두 선택된 후 남아 있는 값 정리하기
            A[k] = result[index1];
            k++;
            index1++;
        }
        while (index2 <= e) {
            //한쪽그룹이 모두 선택된 후 남아 있는 값 정리하기
            A[k] = result[index2];
            k++;
            index2++;
        }
    }
}
