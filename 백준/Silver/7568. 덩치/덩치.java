import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer TC = Integer.parseInt(br.readLine());
        String[] HeightandWeight = new String[TC];
        Integer[] Height = new Integer[TC];
        Integer[] Weight = new Integer[TC];
        for(int i = 0; i < TC; i++){
            HeightandWeight[i] = br.readLine();
        }
        for(int i = 0; i < TC; i++){
            String[] st = HeightandWeight[i].split(" ");
            Height[i] = Integer.parseInt(st[0]);
            Weight[i] = Integer.parseInt(st[1]);
        }
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < TC ; i++){
            int num = 1;
            for(int j = 0; j < TC; j++){
                if(Height[i] < Height[j] && Weight[i] < Weight[j]){
                    num++;
                }
            }
            list.add(i,num);
        }
        for(Integer i : list){
            System.out.println(i);
        }
    }
}

    