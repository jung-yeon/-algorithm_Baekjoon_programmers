import java.util.Scanner;
import java.util.Stack;
public class Main{
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        boolean route = true;
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        StringBuffer bf = new StringBuffer();
        int num = 1;
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < N; i++) {
            if (arr[i] >= num) {
                while (arr[i] >= num) {
                    stack.push(num++);
                    bf.append("+\n");
                }
                stack.pop();
                bf.append("-\n");
            } else {
                int n = stack.pop();
                if (n > arr[i]) {
                    System.out.println("NO");
                    route = false;
                    break;
                } else {
                    bf.append("-\n");
                }
            }
        }
        if (route) System.out.println(bf);
    }
}