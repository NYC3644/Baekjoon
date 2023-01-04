import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = 300, B =60, C = 10, T = sc.nextInt();
        if(T%C!=0){
            System.out.println(-1);
        }
        else {
            System.out.print(T/A+" ");
            T %= A;
            System.out.print(T/B+" ");
            T %= B;
            System.out.print(T/C);
        }
    }
}