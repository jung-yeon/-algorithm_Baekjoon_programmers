import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        HashMap<String, Double> pointMap = new HashMap<String, Double> (){{
            put("A+", 4.5 );
            put("A0", 4.0 );
            put("B+", 3.5 );
            put("B0", 3.0 );
            put("C+", 2.5 );
            put("C0", 2.0 );
            put("D+", 1.5 );
            put("D0", 1.0 );
            put("F", 0.0 );
        }};
        double total = 0;
        double result1 = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i<20; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String subject = st.nextToken();
            double point = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();

            if (grade.equals("P")){
                result1 += 0;
                total +=0;

            }
            else {
                total += point;
                result1 += point * pointMap.get(grade);
            }

        }
        System.out.printf("%f", result1/total);

    }
}
