import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt(), N = sc.nextInt();
        int sum = 0;
        for(int i = 0; i<N; i++){
            int a = sc.nextInt(), b = sc.nextInt();
            sum += a*b;
        }
        System.out.println(sum==X?"Yes":"No");
    }
}