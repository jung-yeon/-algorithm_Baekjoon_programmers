import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args){
        try{
            //다시 한번 풀어보기
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int N = Integer.parseInt(br.readLine());
            String[] strArr = new String[N];
            for(int i = 0; i <N; i++){
                String msg = br.readLine();
                strArr[i] = msg;
            }
            int len = strArr[0].length();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < len; i++) {
                boolean isSame = true; 
                char c = strArr[0].charAt(i);  
                for (int j = 1; j < N; j++) {
                    if (c != strArr[j].charAt(i)) isSame = false;  
                }
                if (isSame) {
                    sb.append(c);  
                } else {
                    sb.append("?"); 
                }
            }
            System.out.print(sb);
        }catch (IOException e){
            System.out.println("IOException : " + e);
        }


    }
}
