import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
        String[] arr = n.split("");
        int sum = 0;
        String zero = "0";
        String result = "";
        if(!(Arrays.asList(arr).contains(zero))){
            System.out.println("-1");
        }
        else{
            for (String s : arr){
                int a =  Integer.parseInt(s);
                sum += a;
            }
            if(sum % 3 != 0){
                System.out.println("-1");
            }
            else {
                Arrays.sort(arr, Collections.reverseOrder());
                for (String s : arr){
                    int a =  Integer.parseInt(s);
                    result += a;
                }
                System.out.println(result);;
            }
        }
    }
}
