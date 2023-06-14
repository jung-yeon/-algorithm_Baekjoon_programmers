import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

////15649번
/*
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
    //백트래킹 / 깊이우선탐색
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

}*/
//12891번
//P와 S의 길이가 1,000,000으로 매우 크기 때문에 O(n)의 시간복잡도 알고리즘으로 문제를 해결해야 함
//슬라이딩 윈도우 개념으로 접근해야함
//public class Main {
//    public static void main(String[]args){
//        Scanner in = new Scanner(System.in);
//        //TODO 1
//        // s,p 입력받기 [s = DNA문자열 입력] , [p = 비밀번호로 사용할 부분문자열의 길이]
//        // DNA입력 받기
//        int s = in.nextInt();
//        int p = in.nextInt();
//
//        String dna = in.next();
//
//        String solution_dna = solution(dna);
//
//        //TODO 2
//        // 입력받은 DNA 문자열 중복제거 후 int a = 중복제거한 배열의 갯수
//        int[] arr = new int[solution_dna.length()];
//        char[] sortArr = new char[solution_dna.length()];
//        for(int i = 0; i < solution_dna.length(); i++){
//            sortArr[i] = solution_dna.charAt(i);
//        }
//        //TODO 3
//        // 오름차순 정렬 후 int dnaArr[] = new int[a]
//        Arrays.sort(sortArr);
//
//
//        //TODO 4
//        // dnaArr개수만큼 입력받기
//        for(int i = 0; i < solution_dna.length(); i++){
//            arr[i] = in.nextInt();
//        }
//    }
//
//
//    //dna 중복제거
//    public static String solution(String str) {
//        String answer = "";
//
//        for (int i = 0; i < str.length(); i++) {
//            if(str.indexOf(str.charAt(i)) == i){
//                answer += str.charAt(i);
//            }
//        }
//
//
//        return answer;
//    }
//
//
//}
public class Main {
    //비밀번호 체크할 배열
    static int checkArr[];
    //현재 상태 배열
    static int myArr[];
    //몇 개의 문자와 관련된 개수를 충족했는지 판단하는 변수
    static int checkSecret;


    public static void main(String[] args) throws IOException, NumberFormatException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s_p = bf.readLine();
        String[] tokens = s_p.split(" ");
        int S = Integer.parseInt(tokens[0]);
        int P = Integer.parseInt(tokens[1]);
//        System.out.println(S);
//        System.out.println(P);
        int Result = 0;
        char dnaArr[] = new char[S];

        checkArr = new int[4];
        myArr = new int[4];
        checkSecret = 0;

        dnaArr = bf.readLine().toCharArray();
        String passwordMinNum = bf.readLine();
        String[] passwordMinNumArr = passwordMinNum.split(" ");
        for(int i = 0; i < 4; i++){
            checkArr[i] = Integer.parseInt(passwordMinNumArr[i]);
            if(checkArr[i] == 0){
                //TODO 1
                checkSecret++;
            }
        }
        for(int i = 0; i<P; i++){
            Add(dnaArr[i]);
        }
        if(checkSecret == 4){
            Result++;
        }
        //슬라이딩 윈도우 처리 부분
        for(int i = P; i < S; i++){
            int j = i - P;
            Add(dnaArr[i]);
            Remove(dnaArr[j]);
            //4자릿수와 관련된 크기가 모두 충족될 때 유효한 비밀번호
            if(checkSecret == 4){
                Result++;
            }
        }
        System.out.println(Result);
        bf.close();

    }

    private static void Remove(char c) {
        switch (c){
            case 'A':
                if(myArr[0] == checkArr[0]){
                    checkSecret--;
                }
                myArr[0]--;
                break;
            case 'C':

                if(myArr[1] == checkArr[1]){
                    checkSecret--;
                }
                myArr[1]--;
                break;
            case 'G':

                if(myArr[2] == checkArr[2]){
                    checkSecret--;
                }
                myArr[2]--;
                break;
            case 'T':

                if(myArr[3] == checkArr[3]){
                    checkSecret--;
                }
                myArr[3]--;
                break;
        }
    }

    private static void Add(char c) {
        switch (c){
            case 'A':
                myArr[0]++;
                if(myArr[0] == checkArr[0]){
                    checkSecret++;
                }
                break;
            case 'C':
                myArr[1]++;
                if(myArr[1] == checkArr[1]){
                    checkSecret++;
                }
                break;
            case 'G':
                myArr[2]++;
                if(myArr[2] == checkArr[2]){
                    checkSecret++;
                }
                break;
            case 'T':
                myArr[3]++;
                if(myArr[3] == checkArr[3]){
                    checkSecret++;
                }
                break;
        }
    }
}


