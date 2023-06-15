import java.io.*;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //출력을 버퍼에 넣고 한 번에 출력하기 위해 BufferedWriter 사용
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //N과 L을 문자열으로 입력받음
        String st = br.readLine();
        //띄어쓰기를 기준으로 tokens배열에 집어넣음
        String[] tokens = st.split(" ");
        //첫 번째 값은 N으로
        //두 번째 값은 L로 집어 넣음 [슬라이딩 윈도우 개수]
        int N = Integer.parseInt(tokens[0]);
        int L = Integer.parseInt(tokens[1]);

        //크기가 N인 배열을 선언
        //최솟값들을 넣을 minD배열을 선언
        int minD[] = new int[N];
        //N개의 수들을 입력
        String st2 = br.readLine();
        //입력된 수들을 tokens2배열에 집어 넣음
        String[] tokens2 = st2.split(" ");
        Deque<Node> mydeque = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            //tokens2에 들어있는 값들은 string 값들 이기때문에 int형으로 형변환을 시켜줍니다.
            int now = Integer.parseInt(tokens2[i]);

            while (!mydeque.isEmpty() && mydeque.getLast().value > now) {
                //만약 mydeque가 비어있지 않고 마지막에 들어있는 value값이 현재 들어온 now값보다 크다면 mydeque의 마지막인덱스에서 삭제해줍니다.
                // --> 이렇게 해주는 이유는 최솟값 비교이기 때문에 큰값은 바로 삭제해줍니다.
                mydeque.removeLast();
            }
            //mydeque에 Node클래스를 넣어줍니다.
            // node 클래스에는 현재 값과 인덱스값이 있습니다.
            mydeque.addLast(new Node(now, i));


            if (mydeque.getFirst().index <= i - L) {
                //슬라이딩 윈도우 개수 L = 3
                // 한번에 3개씩
                //만약 mydeque의 첫번재 인덱스가 1이고 지금 들어오는 인덱스값이 4라면 슬라이딩 윈도위 크기를 벗어나기 때문에
                //첫번째 인덱스 값을 삭제 해준다
                mydeque.removeFirst();
            }

            //버퍼에 넣는 방법
            bw.write(mydeque.getFirst().value + " ");
        }

        // 버퍼 출력하고 닫기
        bw.flush();
        bw.close();

    }

    static class Node {
        public int value;
        public int index;

        Node(int value, int index) {
            this.value = value;
            this.index = index;
        }
    }
}
