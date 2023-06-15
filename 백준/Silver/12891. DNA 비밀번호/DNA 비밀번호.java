import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;
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


