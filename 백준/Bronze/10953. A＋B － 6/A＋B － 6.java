import java.io.*;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int TC = Integer.parseInt(br.readLine());

        int[] resultAdd = new int[TC];

        for(int i = 0; i < TC; i++){
            String numbers = br.readLine();
            String[] number = numbers.split(",");
            resultAdd[i] = add(Integer.parseInt(number[0]),Integer.parseInt(number[1]));
        }
        for(int i = 0; i < resultAdd.length; i++){
            System.out.println(resultAdd[i]);
        }
    }
    public static int add(int num1, int num2){
        int sum = 0;
        sum = num1 + num2;
        return sum;
    }



}
