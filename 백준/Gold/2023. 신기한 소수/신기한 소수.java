import java.util.Scanner;

public class Main {
    static int N;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        /*
        * 1 - 9까지의 수에서 소수는
        * 2 3 5 7이다
        * 앞자리수는 2 3 5 7 중에 하나
        */
        DFS(2,1);
        DFS(3,1);
        DFS(5,1);
        DFS(7,1);
    }

    static void DFS(int number, int jarisu){
    //자리수가 N이고 소수판별이 true라면 출력
        if(jarisu == N){
            if(isPrime(number)){
                System.out.println(number);
            }
            return;
        }
        for(int i = 1; i<10; i++){
            if(i%2 ==0){
                //짝수라면 탐색하지 않는다.
                // 2번째 자리부터 짝수라면 무조건 약수가 존재하기 때문!
                continue;
            }
            if(isPrime(number * 10 + i)){
              DFS(number*10+i, jarisu + 1);
            }
        }
    }
    //약수가 존재하는지 판별
    //즉, 소수인지 판별하기 위해
    static boolean isPrime(int num){
        for(int i = 2; i<=num/2; i++){
            if(num % i == 0)
                return false;
            
        }
        return true;
    }
}