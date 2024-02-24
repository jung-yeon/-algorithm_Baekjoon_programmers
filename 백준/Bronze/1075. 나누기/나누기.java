
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int F = Integer.parseInt(br.readLine());


        int NInt = (N/100) * 100;


        int remainN = NInt % F;
        String answerNum = "";
        if(remainN == 0){
            remainN = 0;
        }
        else {
            remainN = F - (NInt % F);
        }
        if(remainN < 10){
            answerNum = "0" + remainN;
        }
        else{
            answerNum = String.valueOf(remainN);
        }
        System.out.println(answerNum);


    }
}
