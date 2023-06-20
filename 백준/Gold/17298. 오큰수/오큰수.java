import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //수열 A의 크기인 N입력 받음
        int N = Integer.parseInt(br.readLine());
        //수열 A의 원소 N개를 띄어쓰기로 입력한다
        String str = br.readLine();
        String[] tokens = str.split(" ");
        //수열이 담길 배열
        int A[] = new int[N];
        //정답이 담길 배열
        int result[] = new int[N];
        //수열을 담아줌
        for(int i = 0; i < N; i++){
            A[i] = Integer.parseInt(tokens[i]);
        }
        //stack을 생성
        //stack에는 A[]배열의 인덱스 값을 넣어줄거임
        Stack<Integer> stack = new Stack<>();
        //처음 stack은 비어있기 때문에 stack에 첫번째 인덱스 0을 넣어줌
        stack.push(0);
        //인덱스 1부터 시작
        for(int i = 1; i < N; i++){
            //스택이 비어 있지 않고 현재 수열이 스택 top인덱스가 가리키는 수열보다 클 경우
            /*ex) 보기 1번 입력에서
             * A[0] = 3
             * A[1] = 5
             * 스택이 비어있지 않고 A[0] < A[1]이 true이기 때문에 while문 안으로 들어감
            */
            while(!stack.isEmpty() && A[stack.peek()] < A[i]){
                //i =1 일때,
                // stack.pop을 할 경우 result[0] = A[1]이 된다
                result[stack.pop()] = A[i];
                //스택이 비어있기 때문에 while문을 빠져나옴
            }
            //stack이 비어있어야 while문을 빠져나오기 때문에 다음 인덱스 값을 넣어줌
            stack.push(i);
        }
        while(!stack.isEmpty()){
            result[stack.pop()] = -1;
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int n : result){
            bw.write(n + " ");
        }
        bw.write("\n");
        bw.flush();
    }
}
