import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String numberofverify = br.readLine();
        br.close();
        String[] strNumbers = numberofverify.split(" ");

        int[] mathPow = new int[strNumbers.length];

        int sumMathPow = 0;
        for(int i = 0; i < strNumbers.length; i++){
            int originNum = Integer.parseInt(strNumbers[i]);
            mathPow[i] = (int) Math.pow(originNum,2);
            sumMathPow += mathPow[i];
        }
        int result = sumMathPow % 10;
        System.out.println(result);
    }
}
